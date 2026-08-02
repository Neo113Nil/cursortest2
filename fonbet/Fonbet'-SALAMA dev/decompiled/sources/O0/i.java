package O0;

import C0.C0087f;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: O, reason: collision with root package name */
    public static final String[] f4853O = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: N, reason: collision with root package name */
    public final int f4854N;

    public i(int i7) {
        this.f4854N = i7;
    }

    public static void G(s sVar) {
        int visibility = sVar.f4895b.getVisibility();
        HashMap hashMap = sVar.f4894a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = sVar.f4895b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y I(s sVar, s sVar2) {
        y yVar = new y();
        yVar.f4913a = false;
        yVar.f4914b = false;
        if (sVar != null) {
            HashMap hashMap = sVar.f4894a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                yVar.f4915c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                yVar.f4917e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (sVar2 != null) {
                    HashMap hashMap2 = sVar2.f4894a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        yVar.f4916d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        yVar.f4918f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (sVar == null && sVar2 != null) {
                            int i7 = yVar.f4915c;
                            int i8 = yVar.f4916d;
                            if (i7 == i8 && yVar.f4917e == yVar.f4918f) {
                                return yVar;
                            }
                            if (i7 != i8) {
                                if (i7 == 0) {
                                    yVar.f4914b = false;
                                    yVar.f4913a = true;
                                } else if (i8 == 0) {
                                    yVar.f4914b = true;
                                    yVar.f4913a = true;
                                }
                            } else if (yVar.f4918f == null) {
                                yVar.f4914b = false;
                                yVar.f4913a = true;
                            } else if (yVar.f4917e == null) {
                                yVar.f4914b = true;
                                yVar.f4913a = true;
                            }
                        } else if (sVar != null && yVar.f4916d == 0) {
                            yVar.f4914b = true;
                            yVar.f4913a = true;
                        } else if (sVar2 == null && yVar.f4915c == 0) {
                            yVar.f4914b = false;
                            yVar.f4913a = true;
                        }
                        return yVar;
                    }
                }
                yVar.f4916d = -1;
                yVar.f4918f = null;
                if (sVar == null) {
                }
                if (sVar != null) {
                }
                if (sVar2 == null) {
                    yVar.f4914b = false;
                    yVar.f4913a = true;
                }
                return yVar;
            }
        }
        yVar.f4915c = -1;
        yVar.f4917e = null;
        if (sVar2 != null) {
        }
        yVar.f4916d = -1;
        yVar.f4918f = null;
        if (sVar == null) {
        }
        if (sVar != null) {
        }
        if (sVar2 == null) {
        }
        return yVar;
    }

    public final ObjectAnimator H(View view, float f7, float f8) {
        int i7 = 0;
        if (f7 == f8) {
            return null;
        }
        t.f4897a.S(view, f7);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, t.f4898b, f8);
        ofFloat.addListener(new C0087f(view));
        a(new h(view, i7));
        return ofFloat;
    }

    @Override // O0.m
    public final void d(s sVar) {
        G(sVar);
    }

    @Override // O0.m
    public final void g(s sVar) {
        G(sVar);
        sVar.f4894a.put("android:fade:transitionAlpha", Float.valueOf(t.f4897a.D(sVar.f4895b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (I(n(r3, false), q(r3, false)).f4913a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f9  */
    @Override // O0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, s sVar, s sVar2) {
        boolean z4;
        View view;
        int i7;
        Object obj;
        View view2;
        s sVar3;
        View view3;
        float f7;
        boolean z7;
        boolean z8;
        boolean z9;
        ViewGroup viewGroup2;
        int i8;
        int round;
        Bitmap bitmap;
        float f8;
        i iVar;
        float f9;
        Float f10;
        int i9 = this.f4854N;
        y I7 = I(sVar, sVar2);
        if (!I7.f4913a || (I7.f4917e == null && I7.f4918f == null)) {
            return null;
        }
        boolean z10 = true;
        if (I7.f4914b) {
            if ((i9 & 1) == 1 && sVar2 != null) {
                View view4 = sVar2.f4895b;
                if (sVar == null) {
                    View view5 = (View) view4.getParent();
                }
                float floatValue = (sVar == null || (f10 = (Float) sVar.f4894a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f10.floatValue();
                return H(view4, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
            }
            return null;
        }
        int i10 = I7.f4916d;
        if ((i9 & 2) == 2 && sVar != null) {
            View view6 = sVar2 != null ? sVar2.f4895b : null;
            View view7 = sVar.f4895b;
            View view8 = (View) view7.getTag(R.id.save_overlay_view);
            if (view8 != null) {
                sVar3 = sVar;
                i7 = i10;
                obj = "android:fade:transitionAlpha";
                f7 = 1.0f;
                view3 = null;
            } else {
                if (view6 == null || view6.getParent() == null) {
                    if (view6 != null) {
                        z4 = false;
                        view = null;
                        if (z4) {
                            if (view7.getParent() == null) {
                                sVar3 = sVar;
                                i7 = i10;
                                obj = "android:fade:transitionAlpha";
                                f7 = 1.0f;
                                z10 = false;
                                view3 = view;
                                view8 = view7;
                            } else if (view7.getParent() instanceof View) {
                                View view9 = (View) view7.getParent();
                                if (I(q(view9, true), n(view9, true)).f4913a) {
                                    i7 = i10;
                                    obj = "android:fade:transitionAlpha";
                                    view2 = view;
                                    int id = view9.getId();
                                    if (view9.getParent() == null && id != -1) {
                                        viewGroup.findViewById(id);
                                    }
                                    sVar3 = sVar;
                                    view8 = view6;
                                    view3 = view2;
                                    f7 = 1.0f;
                                    z10 = false;
                                } else {
                                    boolean z11 = r.f4891a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    u uVar = t.f4897a;
                                    uVar.q0(view7, matrix);
                                    uVar.r0(viewGroup, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix.mapRect(rectF);
                                    int round2 = Math.round(rectF.left);
                                    int round3 = Math.round(rectF.top);
                                    int round4 = Math.round(rectF.right);
                                    int round5 = Math.round(rectF.bottom);
                                    ImageView imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    if (r.f4891a) {
                                        z7 = !view7.isAttachedToWindow();
                                        if (viewGroup != null) {
                                            z8 = viewGroup.isAttachedToWindow();
                                            z9 = r.f4892b;
                                            if (z9 || !z7) {
                                                view2 = view;
                                                viewGroup2 = null;
                                                i8 = 0;
                                            } else if (z8) {
                                                ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                                int indexOfChild = viewGroup3.indexOfChild(view7);
                                                viewGroup.getOverlay().add(view7);
                                                viewGroup2 = viewGroup3;
                                                view2 = view;
                                                i8 = indexOfChild;
                                            } else {
                                                i7 = i10;
                                                obj = "android:fade:transitionAlpha";
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round5 - round3, 1073741824));
                                                imageView.layout(round2, round3, round4, round5);
                                                sVar3 = sVar;
                                                view8 = imageView;
                                                view3 = view2;
                                                f7 = 1.0f;
                                                z10 = false;
                                            }
                                            i7 = i10;
                                            round = Math.round(rectF.width());
                                            int round6 = Math.round(rectF.height());
                                            if (round > 0 || round6 <= 0) {
                                                obj = "android:fade:transitionAlpha";
                                                bitmap = null;
                                            } else {
                                                obj = "android:fade:transitionAlpha";
                                                float min = Math.min(1.0f, 1048576.0f / (round * round6));
                                                int round7 = Math.round(round * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (r.f4893c) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view7.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = Bitmap.createBitmap(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view7.draw(canvas);
                                                }
                                            }
                                            if (z9 && z7) {
                                                viewGroup.getOverlay().remove(view7);
                                                viewGroup2.addView(view7, i8);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round5 - round3, 1073741824));
                                            imageView.layout(round2, round3, round4, round5);
                                            sVar3 = sVar;
                                            view8 = imageView;
                                            view3 = view2;
                                            f7 = 1.0f;
                                            z10 = false;
                                        }
                                    } else {
                                        z7 = false;
                                    }
                                    z8 = false;
                                    z9 = r.f4892b;
                                    if (z9) {
                                    }
                                    view2 = view;
                                    viewGroup2 = null;
                                    i8 = 0;
                                    i7 = i10;
                                    round = Math.round(rectF.width());
                                    int round62 = Math.round(rectF.height());
                                    if (round > 0) {
                                    }
                                    obj = "android:fade:transitionAlpha";
                                    bitmap = null;
                                    if (z9) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i8);
                                    }
                                    if (bitmap != null) {
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round5 - round3, 1073741824));
                                    imageView.layout(round2, round3, round4, round5);
                                    sVar3 = sVar;
                                    view8 = imageView;
                                    view3 = view2;
                                    f7 = 1.0f;
                                    z10 = false;
                                }
                            }
                        }
                        i7 = i10;
                        obj = "android:fade:transitionAlpha";
                        view2 = view;
                        sVar3 = sVar;
                        view8 = view6;
                        view3 = view2;
                        f7 = 1.0f;
                        z10 = false;
                    }
                } else if (i10 == 4 || view7 == view6) {
                    view = view6;
                    z4 = false;
                    view6 = null;
                    if (z4) {
                    }
                    i7 = i10;
                    obj = "android:fade:transitionAlpha";
                    view2 = view;
                    sVar3 = sVar;
                    view8 = view6;
                    view3 = view2;
                    f7 = 1.0f;
                    z10 = false;
                }
                z4 = true;
                view6 = null;
                view = null;
                if (z4) {
                }
                i7 = i10;
                obj = "android:fade:transitionAlpha";
                view2 = view;
                sVar3 = sVar;
                view8 = view6;
                view3 = view2;
                f7 = 1.0f;
                z10 = false;
            }
            HashMap hashMap = sVar3.f4894a;
            if (view8 != null) {
                if (!z10) {
                    int[] iArr = (int[]) hashMap.get("android:visibility:screenLocation");
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i11 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i12 - iArr2[1]) - view8.getTop());
                    viewGroup.getOverlay().add(view8);
                }
                t.f4897a.getClass();
                Float f11 = (Float) hashMap.get(obj);
                if (f11 != null) {
                    f9 = f11.floatValue();
                    f8 = 0.0f;
                    iVar = this;
                } else {
                    f8 = 0.0f;
                    iVar = this;
                    f9 = f7;
                }
                ObjectAnimator H7 = iVar.H(view8, f9, f8);
                if (z10) {
                    return H7;
                }
                if (H7 == null) {
                    viewGroup.getOverlay().remove(view8);
                    return H7;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                iVar.a(new w(iVar, viewGroup, view8, view7));
                return H7;
            }
            Object obj2 = obj;
            if (view3 != null) {
                int visibility = view3.getVisibility();
                u uVar2 = t.f4897a;
                uVar2.T(view3, 0);
                uVar2.getClass();
                Float f12 = (Float) hashMap.get(obj2);
                ObjectAnimator H8 = H(view3, f12 != null ? f12.floatValue() : f7, 0.0f);
                if (H8 != null) {
                    x xVar = new x(view3, i7);
                    H8.addListener(xVar);
                    H8.addPauseListener(xVar);
                    a(xVar);
                } else {
                    uVar2.T(view3, visibility);
                }
                return H8;
            }
        }
        return null;
    }

    @Override // O0.m
    public final String[] p() {
        return f4853O;
    }

    @Override // O0.m
    public final boolean r(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f4894a.containsKey("android:visibility:visibility") != sVar.f4894a.containsKey("android:visibility:visibility")) {
            return false;
        }
        y I7 = I(sVar, sVar2);
        if (I7.f4913a) {
            return I7.f4915c == 0 || I7.f4916d == 0;
        }
        return false;
    }
}
