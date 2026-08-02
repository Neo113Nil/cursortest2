package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import w1.L;

/* loaded from: classes.dex */
public final class x implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final y f18389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18391c;

    public x(Context context, y yVar, XmlResourceParser xmlResourceParser) {
        this.f18390b = -1;
        this.f18391c = 17;
        this.f18389a = yVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), B.q.f949u);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 1) {
                this.f18390b = obtainStyledAttributes.getResourceId(index, this.f18390b);
            } else if (index == 0) {
                this.f18391c = obtainStyledAttributes.getInt(index, this.f18391c);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View] */
    public final void a(MotionLayout motionLayout, int i7, y yVar) {
        int i8 = this.f18390b;
        MotionLayout motionLayout2 = motionLayout;
        if (i8 != -1) {
            motionLayout2 = motionLayout.findViewById(i8);
        }
        if (motionLayout2 == null) {
            L.k(i8, "OnClick could not find id ", "MotionScene");
            return;
        }
        int i9 = yVar.f18395d;
        int i10 = yVar.f18394c;
        if (i9 == -1) {
            motionLayout2.setOnClickListener(this);
            return;
        }
        int i11 = this.f18391c;
        int i12 = i11 & 1;
        if (((i12 != 0 && i7 == i9) | (i12 != 0 && i7 == i9) | ((i11 & 256) != 0 && i7 == i9) | ((i11 & 16) != 0 && i7 == i10)) || ((i11 & 4096) != 0 && i7 == i10)) {
            motionLayout2.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i7 = this.f18390b;
        if (i7 == -1) {
            return;
        }
        View findViewById = motionLayout.findViewById(i7);
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        y yVar = this.f18389a;
        z zVar = yVar.j;
        MotionLayout motionLayout = zVar.f18409a;
        if (motionLayout.f8852S) {
            if (yVar.f18395d == -1) {
                int currentState = motionLayout.getCurrentState();
                if (currentState == -1) {
                    motionLayout.z(yVar.f18394c);
                    return;
                }
                y yVar2 = new y(zVar, yVar);
                yVar2.f18395d = currentState;
                yVar2.f18394c = yVar.f18394c;
                motionLayout.setTransition(yVar2);
                motionLayout.k(1.0f);
                motionLayout.f8845O0 = null;
                return;
            }
            y yVar3 = zVar.f18411c;
            int i7 = this.f18391c;
            int i8 = i7 & 1;
            boolean z4 = true;
            boolean z7 = false;
            boolean z8 = (i8 == 0 && (i7 & 256) == 0) ? false : true;
            int i9 = i7 & 16;
            if (i9 == 0 && (i7 & 4096) == 0) {
                z4 = false;
            }
            if (z8 && z4) {
                if (yVar3 != yVar) {
                    motionLayout.setTransition(yVar);
                }
                if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                    z4 = false;
                }
                if (yVar != yVar3) {
                    int i10 = yVar.f18394c;
                    int i11 = yVar.f18395d;
                    if (i11 != -1) {
                        int i12 = motionLayout.f8844O;
                        if (i12 != i11 && i12 != i10) {
                            return;
                        }
                    } else if (motionLayout.f8844O == i10) {
                        return;
                    }
                }
                if (!z7 && i8 != 0) {
                    motionLayout.setTransition(yVar);
                    motionLayout.k(1.0f);
                    motionLayout.f8845O0 = null;
                    return;
                }
                if (!z4 && i9 != 0) {
                    motionLayout.setTransition(yVar);
                    motionLayout.k(0.0f);
                    return;
                } else if (!z7 && (i7 & 256) != 0) {
                    motionLayout.setTransition(yVar);
                    motionLayout.setProgress(1.0f);
                    return;
                } else {
                    if (z4 || (i7 & 4096) == 0) {
                    }
                    motionLayout.setTransition(yVar);
                    motionLayout.setProgress(0.0f);
                    return;
                }
            }
            z7 = z8;
            if (yVar != yVar3) {
            }
            if (!z7) {
            }
            if (!z4) {
            }
            if (!z7) {
            }
            if (z4) {
            }
        }
    }
}
