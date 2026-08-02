package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: fr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0221fr extends sq1 {

    /* JADX INFO: renamed from: k */
    public final boolean f2479k;

    /* JADX INFO: renamed from: l */
    public boolean f2480l;

    /* JADX INFO: renamed from: m */
    public f50 f2481m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0221fr(i91 i91Var, boolean z) {
        super(i91Var);
        i91Var.getClass();
        this.f2479k = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4 A[Catch: RuntimeException -> 0x00ea, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00ea, blocks: (B:78:0x00de, B:80:0x00e4), top: B:91:0x00de }] */
    /* JADX INFO: renamed from: B */
    public final f50 m1886B(Context context) {
        int i;
        f50 f50Var;
        Animator animatorLoadAnimator;
        int iM3500i;
        if (this.f2480l) {
            return this.f2481m;
        }
        i91 i91Var = (i91) this.f7192j;
        c50 c50Var = i91Var.f3488c;
        boolean z = i91Var.f3486a == 2;
        b50 b50Var = c50Var.f1115S;
        int i2 = b50Var == null ? 0 : b50Var.f720f;
        if (this.f2479k) {
            if (z) {
                if (b50Var == null) {
                    i = 0;
                } else {
                    i = b50Var.f718d;
                }
            } else if (b50Var == null) {
                i = 0;
            } else {
                i = b50Var.f719e;
            }
        } else if (z) {
            if (b50Var == null) {
                i = 0;
            } else {
                i = b50Var.f716b;
            }
        } else if (b50Var == null) {
            i = 0;
        } else {
            i = b50Var.f717c;
        }
        c50Var.m858F(0, 0, 0, 0);
        ViewGroup viewGroup = c50Var.f1111O;
        f50 f50Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            c50Var.f1111O.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = c50Var.f1111O;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iM3500i = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i2 == 8194) {
                    iM3500i = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i2 == 8197) {
                    iM3500i = z ? n80.m3500i(context, android.R.attr.activityCloseEnterAnimation) : n80.m3500i(context, android.R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iM3500i = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i2 != 4100) {
                    iM3500i = -1;
                } else {
                    iM3500i = z ? n80.m3500i(context, android.R.attr.activityOpenEnterAnimation) : n80.m3500i(context, android.R.attr.activityOpenExitAnimation);
                }
                i = iM3500i;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            f50Var = new f50(0, animationLoadAnimation);
                            f50Var2 = f50Var;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                f50Var = new f50(animatorLoadAnimator);
                                f50Var2 = f50Var;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                f50Var2 = new f50(0, animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        f50Var = new f50(animatorLoadAnimator);
                        f50Var2 = f50Var;
                    }
                }
            }
        }
        this.f2481m = f50Var2;
        this.f2480l = true;
        return f50Var2;
    }
}
