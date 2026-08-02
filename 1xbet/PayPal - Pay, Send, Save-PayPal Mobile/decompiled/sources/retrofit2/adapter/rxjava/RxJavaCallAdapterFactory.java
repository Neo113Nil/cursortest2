package retrofit2.adapter.rxjava;

/* loaded from: classes18.dex */
public final class RxJavaCallAdapterFactory extends retrofit2.CallAdapter.Factory {

    @javax.annotation.Nullable
    private final rx.Scheduler getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;

    public static retrofit2.adapter.rxjava.RxJavaCallAdapterFactory create() {
        return new retrofit2.adapter.rxjava.RxJavaCallAdapterFactory(null, false);
    }

    public static retrofit2.adapter.rxjava.RxJavaCallAdapterFactory createAsync() {
        return new retrofit2.adapter.rxjava.RxJavaCallAdapterFactory(null, true);
    }

    public static retrofit2.adapter.rxjava.RxJavaCallAdapterFactory createWithScheduler(rx.Scheduler scheduler) {
        if (scheduler == null) {
            throw new java.lang.NullPointerException("scheduler == null");
        }
        return new retrofit2.adapter.rxjava.RxJavaCallAdapterFactory(scheduler, false);
    }

    private RxJavaCallAdapterFactory(@javax.annotation.Nullable rx.Scheduler scheduler, boolean z) {
        this.getHighSpeedVideoFpsRanges = scheduler;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public final retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        java.lang.reflect.Type type2;
        boolean z;
        boolean z2;
        java.lang.Class<?> rawType = getRawType(type);
        boolean z3 = rawType == rx.Single.class;
        boolean z4 = rawType == rx.Completable.class;
        if (rawType != rx.Observable.class && !z3 && !z4) {
            return null;
        }
        if (z4) {
            return new retrofit2.adapter.rxjava.RxJavaCallAdapter(java.lang.Void.class, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, false, true, false, true);
        }
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            java.lang.String str = z3 ? "Single" : "Observable";
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" return type must be parameterized as ");
            sb.append(str);
            sb.append("<Foo> or ");
            sb.append(str);
            sb.append("<? extends Foo>");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        java.lang.reflect.Type parameterUpperBound = getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type);
        java.lang.Class<?> rawType2 = getRawType(parameterUpperBound);
        if (rawType2 == retrofit2.Response.class) {
            if (!(parameterUpperBound instanceof java.lang.reflect.ParameterizedType)) {
                throw new java.lang.IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            type2 = getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) parameterUpperBound);
            z2 = false;
            z = false;
        } else if (rawType2 != retrofit2.adapter.rxjava.Result.class) {
            type2 = parameterUpperBound;
            z = true;
            z2 = false;
        } else {
            if (!(parameterUpperBound instanceof java.lang.reflect.ParameterizedType)) {
                throw new java.lang.IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            type2 = getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) parameterUpperBound);
            z2 = true;
            z = false;
        }
        return new retrofit2.adapter.rxjava.RxJavaCallAdapter(type2, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, z2, z, z3, false);
    }
}
