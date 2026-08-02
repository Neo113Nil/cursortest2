package androidx.core.animation;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u001a/\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\u0007\u001a/\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u0007\u001a*\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u000e\u0010\r\u001a\u0080\u0001\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0006\u0010\u000f\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\u0010\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\u0011\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\u0012\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001aG\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "action", "Landroid/animation/Animator$AnimatorListener;", "doOnEnd", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function1;)Landroid/animation/Animator$AnimatorListener;", "doOnStart", "doOnCancel", "doOnRepeat", "Landroid/animation/Animator$AnimatorPauseListener;", "doOnResume", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function1;)Landroid/animation/Animator$AnimatorPauseListener;", "doOnPause", "onEnd", "onStart", "onCancel", "onRepeat", "addListener", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/animation/Animator$AnimatorListener;", "onResume", "onPause", "addPauseListener", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/animation/Animator$AnimatorPauseListener;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnimatorKt {
    public static final android.animation.Animator.AnimatorPauseListener doOnResume(android.animation.Animator animator, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1) {
        return addPauseListener$default(animator, function1, null, 2, null);
    }

    public static final android.animation.Animator.AnimatorPauseListener doOnPause(android.animation.Animator animator, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1) {
        return addPauseListener$default(animator, null, function1, 1, null);
    }

    public static /* synthetic */ android.animation.Animator.AnimatorListener addListener$default(android.animation.Animator animator, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt$addListener$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function12 = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt$addListener$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function13 = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt$addListener$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function14 = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt$addListener$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator animator2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        androidx.core.animation.AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new androidx.core.animation.AnimatorKt$addListener$listener$1(function14, function1, function13, function12);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final android.animation.Animator.AnimatorListener addListener(android.animation.Animator animator, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function14) {
        androidx.core.animation.AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new androidx.core.animation.AnimatorKt$addListener$listener$1(function14, function1, function13, function12);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ android.animation.Animator.AnimatorPauseListener addPauseListener$default(android.animation.Animator animator, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.core.animation.AnimatorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        if ((i & 2) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.core.animation.AnimatorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        return addPauseListener(animator, function1, function12);
    }

    public static final android.animation.Animator.AnimatorPauseListener addPauseListener(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function12) {
        android.animation.Animator.AnimatorPauseListener animatorPauseListener = new android.animation.Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public final void onAnimationPause(android.animation.Animator animator2) {
                function12.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public final void onAnimationResume(android.animation.Animator animator2) {
                function1.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static final android.animation.Animator.AnimatorListener doOnEnd(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1) {
        android.animation.Animator.AnimatorListener animatorListener = new android.animation.Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator2) {
                kotlin.jvm.functions.Function1.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final android.animation.Animator.AnimatorListener doOnStart(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1) {
        android.animation.Animator.AnimatorListener animatorListener = new android.animation.Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(android.animation.Animator animator2) {
                kotlin.jvm.functions.Function1.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final android.animation.Animator.AnimatorListener doOnCancel(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1) {
        android.animation.Animator.AnimatorListener animatorListener = new android.animation.Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(android.animation.Animator animator2) {
                kotlin.jvm.functions.Function1.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final android.animation.Animator.AnimatorListener doOnRepeat(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1) {
        android.animation.Animator.AnimatorListener animatorListener = new android.animation.Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(android.animation.Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(android.animation.Animator animator2) {
                kotlin.jvm.functions.Function1.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
