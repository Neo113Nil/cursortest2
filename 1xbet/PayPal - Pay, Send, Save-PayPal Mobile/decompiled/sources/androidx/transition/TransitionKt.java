package androidx.transition;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u009b\u0001\u0010\n\u001a\u00020\t*\u00020\u00002\u0019\b\u0006\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\r\u001a\u00020\t*\u00020\u00002\u0019\b\u0004\u0010\f\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0019\b\u0004\u0010\f\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a/\u0010\u0010\u001a\u00020\t*\u00020\u00002\u0019\b\u0004\u0010\f\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u000e\u001a/\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0019\b\u0004\u0010\f\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0011\u0010\u000e\u001a/\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0019\b\u0004\u0010\f\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0012\u0010\u000e"}, d2 = {"Landroidx/transition/Transition;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "onEnd", "onStart", "onCancel", "onResume", "onPause", "Landroidx/transition/Transition$TransitionListener;", "addListener", "(Landroidx/transition/Transition;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/transition/Transition$TransitionListener;", "action", "doOnCancel", "(Landroidx/transition/Transition;Lkotlin/jvm/functions/Function1;)Landroidx/transition/Transition$TransitionListener;", "doOnEnd", "doOnPause", "doOnResume", "doOnStart"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TransitionKt {
    public static /* synthetic */ androidx.transition.Transition.TransitionListener addListener$default(androidx.transition.Transition transition, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit>() { // from class: androidx.transition.TransitionKt$addListener$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.transition.Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function12 = new kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit>() { // from class: androidx.transition.TransitionKt$addListener$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.transition.Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function1 function16 = function12;
        if ((i & 4) != 0) {
            function13 = new kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit>() { // from class: androidx.transition.TransitionKt$addListener$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.transition.Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function1 function17 = function13;
        if ((i & 8) != 0) {
            function14 = new kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit>() { // from class: androidx.transition.TransitionKt$addListener$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.transition.Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 16) != 0) {
            function15 = new kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit>() { // from class: androidx.transition.TransitionKt$addListener$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.transition.Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        androidx.transition.TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new androidx.transition.TransitionKt$addListener$listener$1(function1, function14, function15, function17, function16);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final androidx.transition.Transition.TransitionListener addListener(androidx.transition.Transition transition, kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function15) {
        androidx.transition.TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new androidx.transition.TransitionKt$addListener$listener$1(function1, function14, function15, function13, function12);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final androidx.transition.Transition.TransitionListener doOnEnd(androidx.transition.Transition transition, final kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function1) {
        androidx.transition.Transition.TransitionListener transitionListener = new androidx.transition.Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(androidx.transition.Transition transition2) {
                kotlin.jvm.functions.Function1.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final androidx.transition.Transition.TransitionListener doOnStart(androidx.transition.Transition transition, final kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function1) {
        androidx.transition.Transition.TransitionListener transitionListener = new androidx.transition.Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(androidx.transition.Transition transition2) {
                kotlin.jvm.functions.Function1.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final androidx.transition.Transition.TransitionListener doOnCancel(androidx.transition.Transition transition, final kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function1) {
        androidx.transition.Transition.TransitionListener transitionListener = new androidx.transition.Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(androidx.transition.Transition transition2) {
                kotlin.jvm.functions.Function1.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final androidx.transition.Transition.TransitionListener doOnResume(androidx.transition.Transition transition, final kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function1) {
        androidx.transition.Transition.TransitionListener transitionListener = new androidx.transition.Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume(androidx.transition.Transition transition2) {
                kotlin.jvm.functions.Function1.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final androidx.transition.Transition.TransitionListener doOnPause(androidx.transition.Transition transition, final kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function1) {
        androidx.transition.Transition.TransitionListener transitionListener = new androidx.transition.Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(androidx.transition.Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause(androidx.transition.Transition transition2) {
                kotlin.jvm.functions.Function1.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
