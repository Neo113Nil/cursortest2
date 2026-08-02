package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
final class FuturesGetChecked {
    private static final com.google.common.collect.Ordering<java.util.List<java.lang.Class<?>>> ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST;
    private static final com.google.common.collect.Ordering<java.lang.reflect.Constructor<?>> WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM;

    interface GetCheckedTypeValidator {
        void validateClass(java.lang.Class<? extends java.lang.Exception> cls);
    }

    static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> cls) throws java.lang.Exception {
        return (V) getChecked(bestGetCheckedTypeValidator(), future, cls);
    }

    static <V, X extends java.lang.Exception> V getChecked(com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator getCheckedTypeValidator, java.util.concurrent.Future<V> future, java.lang.Class<X> cls) throws java.lang.Exception {
        getCheckedTypeValidator.validateClass(cls);
        try {
            return future.get();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw newWithCause(cls, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            wrapAndThrowExceptionOrError(e2.getCause(), cls);
            throw new java.lang.AssertionError();
        }
    }

    static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> cls, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.Exception {
        bestGetCheckedTypeValidator().validateClass(cls);
        try {
            return future.get(j, timeUnit);
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw newWithCause(cls, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            wrapAndThrowExceptionOrError(e2.getCause(), cls);
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e3) {
            throw newWithCause(cls, e3);
        }
    }

    private static com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator bestGetCheckedTypeValidator() {
        return com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.BEST_VALIDATOR;
    }

    static com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator weakSetValidator() {
        return com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    static final class GetCheckedTypeValidatorHolder {
        static final com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator BEST_VALIDATOR = getBestValidator();

        private GetCheckedTypeValidatorHolder() {
        }

        enum WeakSetValidator implements com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator {
            INSTANCE;

            private static final java.util.Set<java.lang.ref.WeakReference<java.lang.Class<? extends java.lang.Exception>>> validClasses = new java.util.concurrent.CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public final void validateClass(java.lang.Class<? extends java.lang.Exception> cls) {
                java.util.Iterator<java.lang.ref.WeakReference<java.lang.Class<? extends java.lang.Exception>>> it = validClasses.iterator();
                while (it.hasNext()) {
                    if (cls.equals(it.next().get())) {
                        return;
                    }
                }
                com.google.common.util.concurrent.FuturesGetChecked.checkExceptionClassValidity(cls);
                java.util.Set<java.lang.ref.WeakReference<java.lang.Class<? extends java.lang.Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new java.lang.ref.WeakReference<>(cls));
            }
        }

        static com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator getBestValidator() {
            return com.google.common.util.concurrent.FuturesGetChecked.weakSetValidator();
        }
    }

    private static <X extends java.lang.Exception> void wrapAndThrowExceptionOrError(java.lang.Throwable th, java.lang.Class<X> cls) throws java.lang.Exception {
        if (th instanceof java.lang.Error) {
            throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) th);
        }
        if (th instanceof java.lang.RuntimeException) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(th);
        }
        throw newWithCause(cls, th);
    }

    private static boolean hasConstructorUsableByGetChecked(java.lang.Class<? extends java.lang.Exception> cls) {
        try {
            newWithCause(cls, new java.lang.Exception());
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static <X extends java.lang.Exception> X newWithCause(java.lang.Class<X> cls, java.lang.Throwable th) {
        java.util.Iterator it = preferringStringsThenThrowables(java.util.Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            X x = (X) newFromConstructor((java.lang.reflect.Constructor) it.next(), th);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(th);
                }
                return x;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No appropriate constructor for exception of type ");
        sb.append(cls);
        sb.append(" in response to chained exception");
        throw new java.lang.IllegalArgumentException(sb.toString(), th);
    }

    private static <X extends java.lang.Exception> java.util.List<java.lang.reflect.Constructor<X>> preferringStringsThenThrowables(java.util.List<java.lang.reflect.Constructor<X>> list) {
        return (java.util.List<java.lang.reflect.Constructor<X>>) WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM.sortedCopy(list);
    }

    static {
        com.google.common.collect.Ordering<java.util.List<java.lang.Class<?>>> reverse = com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.FuturesGetChecked$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Comparable valueOf;
                valueOf = java.lang.Boolean.valueOf(((java.util.List) obj).contains(java.lang.String.class));
                return valueOf;
            }
        }).compound(com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.FuturesGetChecked$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Comparable valueOf;
                valueOf = java.lang.Boolean.valueOf(((java.util.List) obj).contains(java.lang.Throwable.class));
                return valueOf;
            }
        })).reverse();
        ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST = reverse;
        WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM = reverse.onResultOf(new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.FuturesGetChecked$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.List asList;
                asList = java.util.Arrays.asList(((java.lang.reflect.Constructor) obj).getParameterTypes());
                return asList;
            }
        });
    }

    private static <X> X newFromConstructor(java.lang.reflect.Constructor<X> constructor, java.lang.Throwable th) {
        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
        java.lang.Object[] objArr = new java.lang.Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            java.lang.Class<?> cls = parameterTypes[i];
            if (cls.equals(java.lang.String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(java.lang.Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    static boolean isCheckedException(java.lang.Class<? extends java.lang.Exception> cls) {
        return !java.lang.RuntimeException.class.isAssignableFrom(cls);
    }

    static void checkExceptionClassValidity(java.lang.Class<? extends java.lang.Exception> cls) {
        com.google.common.base.Preconditions.checkArgument(isCheckedException(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        com.google.common.base.Preconditions.checkArgument(hasConstructorUsableByGetChecked(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    private FuturesGetChecked() {
    }
}
