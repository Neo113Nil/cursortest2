package j;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class c extends AbstractC2349a {

    /* renamed from: n, reason: collision with root package name */
    public final ObjectAnimator f17380n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17381o;

    public c(AnimationDrawable animationDrawable, boolean z3, boolean z5) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z3 ? numberOfFrames - 1 : 0;
        int i5 = z3 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f17383b = numberOfFrames2;
        int[] iArr = dVar.f17382a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f17382a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f17382a;
        int i6 = 0;
        for (int i7 = 0; i7 < numberOfFrames2; i7++) {
            int duration = animationDrawable.getDuration(z3 ? (numberOfFrames2 - i7) - 1 : i7);
            iArr2[i7] = duration;
            i6 += duration;
        }
        dVar.f17384c = i6;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i5);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(dVar.f17384c);
        ofInt.setInterpolator(dVar);
        this.f17381o = z5;
        this.f17380n = ofInt;
    }

    @Override // r3.AbstractC2349a
    public final void M() {
        this.f17380n.reverse();
    }

    @Override // r3.AbstractC2349a
    public final void O() {
        this.f17380n.start();
    }

    @Override // r3.AbstractC2349a
    public final void P() {
        this.f17380n.cancel();
    }

    @Override // r3.AbstractC2349a
    public final boolean n() {
        return this.f17381o;
    }
}
