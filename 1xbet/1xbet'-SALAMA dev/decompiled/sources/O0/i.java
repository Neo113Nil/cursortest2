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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i extends m {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String[] f4853O = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f4854N;

    public i(int i7) {
        this.f4854N = i7;
    }

    public static void G(s sVar) {
        int visibility = sVar.f4895b.getVisibility();
        HashMap map = sVar.f4894a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = sVar.f4895b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static y I(s sVar, s sVar2) {
        y yVar = new y();
        yVar.f4913a = false;
        yVar.f4914b = false;
        if (sVar != null) {
            HashMap map = sVar.f4894a;
            if (map.containsKey("android:visibility:visibility")) {
                yVar.f4915c = ((Integer) map.get("android:visibility:visibility")).intValue();
                yVar.f4917e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                yVar.f4915c = -1;
                yVar.f4917e = null;
            }
        } else {
            yVar.f4915c = -1;
            yVar.f4917e = null;
        }
        if (sVar2 != null) {
            HashMap map2 = sVar2.f4894a;
            if (map2.containsKey("android:visibility:visibility")) {
                yVar.f4916d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                yVar.f4918f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                yVar.f4916d = -1;
                yVar.f4918f = null;
            }
        } else {
            yVar.f4916d = -1;
            yVar.f4918f = null;
        }
        if (sVar != null && sVar2 != null) {
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
        } else if (sVar == null && yVar.f4916d == 0) {
            yVar.f4914b = true;
            yVar.f4913a = true;
        } else if (sVar2 == null && yVar.f4915c == 0) {
            yVar.f4914b = false;
            yVar.f4913a = true;
        }
        return yVar;
    }

    public final ObjectAnimator H(View view, float f7, float f8) {
        int i7 = 0;
        if (f7 == f8) {
            return null;
        }
        t.f4897a.S(view, f7);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, t.f4898b, f8);
        objectAnimatorOfFloat.addListener(new C0087f(view));
        a(new h(view, i7));
        return objectAnimatorOfFloat;
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

    /* JADX WARN: Code duplicated, block: B:100:0x0230  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00df  */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    /* JADX WARN: Code duplicated, block: B:75:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0178  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0219  */
    /* JADX WARN: Code duplicated, block: B:97:0x0229  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (I(n(r3, false), q(r3, false)).f4913a != false) goto L20;
     */
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
        float f7;
        View view3;
        int id;
        RectF rectF;
        ImageView imageView;
        boolean z7;
        boolean zIsAttachedToWindow;
        boolean z8;
        ViewGroup viewGroup2;
        int i8;
        int iRound;
        Bitmap bitmapCreateBitmap;
        float f8;
        float fFloatValue;
        Float f9;
        int i9 = this.f4854N;
        y yVarI = I(sVar, sVar2);
        if (!yVarI.f4913a || (yVarI.f4917e == null && yVarI.f4918f == null)) {
            return null;
        }
        boolean z9 = true;
        if (yVarI.f4914b) {
            if ((i9 & 1) == 1 && sVar2 != null) {
                View view4 = sVar2.f4895b;
                if (sVar == null) {
                    View view5 = (View) view4.getParent();
                }
                float fFloatValue2 = (sVar == null || (f9 = (Float) sVar.f4894a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f9.floatValue();
                return H(view4, fFloatValue2 != 1.0f ? fFloatValue2 : 0.0f, 1.0f);
            }
            return null;
        }
        int i10 = yVarI.f4916d;
        if ((i9 & 2) == 2 && sVar != null) {
            View view6 = sVar2 != null ? sVar2.f4895b : null;
            View view7 = sVar.f4895b;
            View view8 = (View) view7.getTag(R.id.save_overlay_view);
            if (view8 != null) {
                sVar = sVar;
                i7 = i10;
                obj = "android:fade:transitionAlpha";
                f7 = 1.0f;
                view2 = null;
            } else {
                if (view6 == null || view6.getParent() == null) {
                    if (view6 != null) {
                        z4 = false;
                    }
                    view = null;
                    if (!z4) {
                        i7 = i10;
                        obj = "android:fade:transitionAlpha";
                        view = view;
                        view8 = view6;
                        view2 = view;
                        f7 = 1.0f;
                        z9 = false;
                    } else if (view7.getParent() == null) {
                        sVar = sVar;
                        i7 = i10;
                        obj = "android:fade:transitionAlpha";
                        f7 = 1.0f;
                        z9 = false;
                        view2 = view;
                        view8 = view7;
                    } else {
                        if (view7.getParent() instanceof View) {
                            view3 = (View) view7.getParent();
                            if (I(q(view3, true), n(view3, true)).f4913a) {
                                i7 = i10;
                                obj = "android:fade:transitionAlpha";
                                view = view;
                                id = view3.getId();
                                if (view3.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            } else {
                                boolean z10 = r.f4891a;
                                Matrix matrix = new Matrix();
                                matrix.setTranslate(-view3.getScrollX(), -view3.getScrollY());
                                u uVar = t.f4897a;
                                uVar.q0(view7, matrix);
                                uVar.r0(viewGroup, matrix);
                                rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                matrix.mapRect(rectF);
                                int iRound2 = Math.round(rectF.left);
                                int iRound3 = Math.round(rectF.top);
                                int iRound4 = Math.round(rectF.right);
                                int iRound5 = Math.round(rectF.bottom);
                                imageView = new ImageView(view7.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (r.f4891a) {
                                    z7 = !view7.isAttachedToWindow();
                                    if (viewGroup != null) {
                                        zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                    }
                                    z8 = r.f4892b;
                                    if (z8 || !z7) {
                                        viewGroup2 = null;
                                        i8 = 0;
                                    } else {
                                        if (zIsAttachedToWindow) {
                                            ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                            int iIndexOfChild = viewGroup3.indexOfChild(view7);
                                            viewGroup.getOverlay().add(view7);
                                            viewGroup2 = viewGroup3;
                                            i8 = iIndexOfChild;
                                        } else {
                                            i7 = i10;
                                            obj = "android:fade:transitionAlpha";
                                            view = view;
                                            bitmapCreateBitmap = null;
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                        imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                        view8 = imageView;
                                    }
                                    i7 = i10;
                                    iRound = Math.round(rectF.width());
                                    int iRound6 = Math.round(rectF.height());
                                    if (iRound > 0 || iRound6 <= 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound6));
                                        int iRound7 = Math.round(iRound * fMin);
                                        int iRound8 = Math.round(iRound6 * fMin);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(fMin, fMin);
                                        if (r.f4893c) {
                                            Picture picture = new Picture();
                                            Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                            canvasBeginRecording.concat(matrix);
                                            view7.draw(canvasBeginRecording);
                                            picture.endRecording();
                                            bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                        } else {
                                            bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                                            canvas.concat(matrix);
                                            view7.draw(canvas);
                                        }
                                    }
                                    if (z8 && z7) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i8);
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                    imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                    view8 = imageView;
                                } else {
                                    z7 = false;
                                }
                                zIsAttachedToWindow = false;
                                z8 = r.f4892b;
                                if (z8) {
                                    viewGroup2 = null;
                                    i8 = 0;
                                    i7 = i10;
                                    iRound = Math.round(rectF.width());
                                    int iRound9 = Math.round(rectF.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z8) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i8);
                                    }
                                } else {
                                    viewGroup2 = null;
                                    i8 = 0;
                                    i7 = i10;
                                    iRound = Math.round(rectF.width());
                                    int iRound10 = Math.round(rectF.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z8) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i8);
                                    }
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                view8 = imageView;
                            }
                            view2 = view;
                            f7 = 1.0f;
                            z9 = false;
                        } else {
                            i7 = i10;
                            obj = "android:fade:transitionAlpha";
                            view = view;
                        }
                        view8 = view6;
                        view2 = view;
                        f7 = 1.0f;
                        z9 = false;
                    }
                } else {
                    if (i10 == 4 || view7 == view6) {
                        view = view6;
                        z4 = false;
                        view6 = null;
                    }
                    if (!z4) {
                        i7 = i10;
                        obj = "android:fade:transitionAlpha";
                        view = view;
                        view8 = view6;
                        view2 = view;
                        f7 = 1.0f;
                        z9 = false;
                    } else if (view7.getParent() == null) {
                        sVar = sVar;
                        i7 = i10;
                        obj = "android:fade:transitionAlpha";
                        f7 = 1.0f;
                        z9 = false;
                        view2 = view;
                        view8 = view7;
                    } else {
                        if (view7.getParent() instanceof View) {
                            view3 = (View) view7.getParent();
                            if (I(q(view3, true), n(view3, true)).f4913a) {
                                boolean z11 = r.f4891a;
                                Matrix matrix2 = new Matrix();
                                matrix2.setTranslate(-view3.getScrollX(), -view3.getScrollY());
                                u uVar2 = t.f4897a;
                                uVar2.q0(view7, matrix2);
                                uVar2.r0(viewGroup, matrix2);
                                rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                matrix2.mapRect(rectF);
                                int iRound11 = Math.round(rectF.left);
                                int iRound12 = Math.round(rectF.top);
                                int iRound13 = Math.round(rectF.right);
                                int iRound14 = Math.round(rectF.bottom);
                                imageView = new ImageView(view7.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (r.f4891a) {
                                    z7 = !view7.isAttachedToWindow();
                                    if (viewGroup != null) {
                                        zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                    }
                                    z8 = r.f4892b;
                                    if (z8) {
                                        viewGroup2 = null;
                                        i8 = 0;
                                        i7 = i10;
                                        iRound = Math.round(rectF.width());
                                        int iRound15 = Math.round(rectF.height());
                                        if (iRound > 0) {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        } else {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        }
                                        if (z8) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i8);
                                        }
                                    } else {
                                        viewGroup2 = null;
                                        i8 = 0;
                                        i7 = i10;
                                        iRound = Math.round(rectF.width());
                                        int iRound16 = Math.round(rectF.height());
                                        if (iRound > 0) {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        } else {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        }
                                        if (z8) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i8);
                                        }
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound13 - iRound11, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound14 - iRound12, 1073741824));
                                    imageView.layout(iRound11, iRound12, iRound13, iRound14);
                                    view8 = imageView;
                                } else {
                                    z7 = false;
                                }
                                zIsAttachedToWindow = false;
                                z8 = r.f4892b;
                                if (z8) {
                                    viewGroup2 = null;
                                    i8 = 0;
                                    i7 = i10;
                                    iRound = Math.round(rectF.width());
                                    int iRound17 = Math.round(rectF.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z8) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i8);
                                    }
                                } else {
                                    viewGroup2 = null;
                                    i8 = 0;
                                    i7 = i10;
                                    iRound = Math.round(rectF.width());
                                    int iRound18 = Math.round(rectF.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z8) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i8);
                                    }
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound13 - iRound11, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound14 - iRound12, 1073741824));
                                imageView.layout(iRound11, iRound12, iRound13, iRound14);
                                view8 = imageView;
                            } else {
                                i7 = i10;
                                obj = "android:fade:transitionAlpha";
                                view = view;
                                id = view3.getId();
                                if (view3.getParent() == null) {
                                    viewGroup.findViewById(id);
                                }
                            }
                            view2 = view;
                            f7 = 1.0f;
                            z9 = false;
                        } else {
                            i7 = i10;
                            obj = "android:fade:transitionAlpha";
                            view = view;
                        }
                        view8 = view6;
                        view2 = view;
                        f7 = 1.0f;
                        z9 = false;
                    }
                }
                z4 = true;
                view6 = null;
                view = null;
                if (!z4) {
                    i7 = i10;
                    obj = "android:fade:transitionAlpha";
                    view = view;
                    view8 = view6;
                    view2 = view;
                    f7 = 1.0f;
                    z9 = false;
                } else if (view7.getParent() == null) {
                    sVar = sVar;
                    i7 = i10;
                    obj = "android:fade:transitionAlpha";
                    f7 = 1.0f;
                    z9 = false;
                    view2 = view;
                    view8 = view7;
                } else {
                    if (view7.getParent() instanceof View) {
                        view3 = (View) view7.getParent();
                        if (I(q(view3, true), n(view3, true)).f4913a) {
                            boolean z12 = r.f4891a;
                            Matrix matrix3 = new Matrix();
                            matrix3.setTranslate(-view3.getScrollX(), -view3.getScrollY());
                            u uVar3 = t.f4897a;
                            uVar3.q0(view7, matrix3);
                            uVar3.r0(viewGroup, matrix3);
                            rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                            matrix3.mapRect(rectF);
                            int iRound19 = Math.round(rectF.left);
                            int iRound110 = Math.round(rectF.top);
                            int iRound111 = Math.round(rectF.right);
                            int iRound112 = Math.round(rectF.bottom);
                            imageView = new ImageView(view7.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            if (r.f4891a) {
                                z7 = !view7.isAttachedToWindow();
                                if (viewGroup != null) {
                                    zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                }
                                z8 = r.f4892b;
                                if (z8) {
                                    viewGroup2 = null;
                                    i8 = 0;
                                    i7 = i10;
                                    iRound = Math.round(rectF.width());
                                    int iRound113 = Math.round(rectF.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z8) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i8);
                                    }
                                } else {
                                    viewGroup2 = null;
                                    i8 = 0;
                                    i7 = i10;
                                    iRound = Math.round(rectF.width());
                                    int iRound114 = Math.round(rectF.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z8) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i8);
                                    }
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound111 - iRound19, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound112 - iRound110, 1073741824));
                                imageView.layout(iRound19, iRound110, iRound111, iRound112);
                                view8 = imageView;
                            } else {
                                z7 = false;
                            }
                            zIsAttachedToWindow = false;
                            z8 = r.f4892b;
                            if (z8) {
                                viewGroup2 = null;
                                i8 = 0;
                                i7 = i10;
                                iRound = Math.round(rectF.width());
                                int iRound115 = Math.round(rectF.height());
                                if (iRound > 0) {
                                    obj = "android:fade:transitionAlpha";
                                    bitmapCreateBitmap = null;
                                } else {
                                    obj = "android:fade:transitionAlpha";
                                    bitmapCreateBitmap = null;
                                }
                                if (z8) {
                                    viewGroup.getOverlay().remove(view7);
                                    viewGroup2.addView(view7, i8);
                                }
                            } else {
                                viewGroup2 = null;
                                i8 = 0;
                                i7 = i10;
                                iRound = Math.round(rectF.width());
                                int iRound116 = Math.round(rectF.height());
                                if (iRound > 0) {
                                    obj = "android:fade:transitionAlpha";
                                    bitmapCreateBitmap = null;
                                } else {
                                    obj = "android:fade:transitionAlpha";
                                    bitmapCreateBitmap = null;
                                }
                                if (z8) {
                                    viewGroup.getOverlay().remove(view7);
                                    viewGroup2.addView(view7, i8);
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound111 - iRound19, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound112 - iRound110, 1073741824));
                            imageView.layout(iRound19, iRound110, iRound111, iRound112);
                            view8 = imageView;
                        } else {
                            i7 = i10;
                            obj = "android:fade:transitionAlpha";
                            view = view;
                            id = view3.getId();
                            if (view3.getParent() == null) {
                                viewGroup.findViewById(id);
                            }
                        }
                        view2 = view;
                        f7 = 1.0f;
                        z9 = false;
                    } else {
                        i7 = i10;
                        obj = "android:fade:transitionAlpha";
                        view = view;
                    }
                    view8 = view6;
                    view2 = view;
                    f7 = 1.0f;
                    z9 = false;
                }
            }
            HashMap map = sVar.f4894a;
            if (view8 != null) {
                if (!z9) {
                    int[] iArr = (int[]) map.get("android:visibility:screenLocation");
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i11 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i12 - iArr2[1]) - view8.getTop());
                    viewGroup.getOverlay().add(view8);
                }
                t.f4897a.getClass();
                Float f10 = (Float) map.get(obj);
                if (f10 != null) {
                    fFloatValue = f10.floatValue();
                    f8 = 0.0f;
                } else {
                    f8 = 0.0f;
                    fFloatValue = f7;
                }
                ObjectAnimator objectAnimatorH = H(view8, fFloatValue, f8);
                if (z9) {
                    return objectAnimatorH;
                }
                if (objectAnimatorH == null) {
                    viewGroup.getOverlay().remove(view8);
                    return objectAnimatorH;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                a(new w(this, viewGroup, view8, view7));
                return objectAnimatorH;
            }
            Object obj2 = obj;
            if (view2 != null) {
                int visibility = view2.getVisibility();
                u uVar4 = t.f4897a;
                uVar4.T(view2, 0);
                uVar4.getClass();
                Float f11 = (Float) map.get(obj2);
                ObjectAnimator objectAnimatorH2 = H(view2, f11 != null ? f11.floatValue() : f7, 0.0f);
                if (objectAnimatorH2 != null) {
                    x xVar = new x(view2, i7);
                    objectAnimatorH2.addListener(xVar);
                    objectAnimatorH2.addPauseListener(xVar);
                    a(xVar);
                } else {
                    uVar4.T(view2, visibility);
                }
                return objectAnimatorH2;
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
        y yVarI = I(sVar, sVar2);
        if (yVarI.f4913a) {
            return yVarI.f4915c == 0 || yVarI.f4916d == 0;
        }
        return false;
    }
}
