package p169z;

import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f18395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18397c;

    public x(Context context, y yVar, XmlResourceParser xmlResourceParser) {
        this.f18396b = -1;
        this.f18397c = 17;
        this.f18395a = yVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f949u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 1) {
                this.f18396b = typedArrayObtainStyledAttributes.getResourceId(index, this.f18396b);
            } else if (index == 0) {
                this.f18397c = typedArrayObtainStyledAttributes.getInt(index, this.f18397c);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(MotionLayout motionLayout, int i7, y yVar) {
        boolean z4;
        View viewFindViewById;
        int i8 = this.f18396b;
        View view = motionLayout;
        if (i8 != -1) {
            viewFindViewById = motionLayout.findViewById(i8);
        }
        if (view == null) {
            view = viewFindViewById;
            L.k(i8, "OnClick could not find id ", "MotionScene");
            return;
        }
        int i9 = yVar.f18401d;
        int i10 = yVar.f18400c;
        if (i9 == -1) {
            view = viewFindViewById;
            view.setOnClickListener(this);
            return;
        }
        int i11 = this.f18397c;
        int i12 = i11 & 1;
        if (i12 == 0 || i7 != i9) {
            view = viewFindViewById;
            z4 = false;
        } else {
            z4 = true;
        }
        if (((i12 != 0 && i7 == i9) | z4 | ((i11 & 256) != 0 && i7 == i9) | ((i11 & 16) != 0 && i7 == i10)) || ((i11 & 4096) != 0 && i7 == i10)) {
            view.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i7 = this.f18396b;
        if (i7 == -1) {
            return;
        }
        View viewFindViewById = motionLayout.findViewById(i7);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + i7);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y yVar = this.f18395a;
        z zVar = yVar.j;
        MotionLayout motionLayout = zVar.f18415a;
        if (motionLayout.f8852S) {
            if (yVar.f18401d == -1) {
                int currentState = motionLayout.getCurrentState();
                if (currentState == -1) {
                    motionLayout.z(yVar.f18400c);
                    return;
                }
                y yVar2 = new y(zVar, yVar);
                yVar2.f18401d = currentState;
                yVar2.f18400c = yVar.f18400c;
                motionLayout.setTransition(yVar2);
                motionLayout.k(1.0f);
                motionLayout.f8845O0 = null;
                return;
            }
            y yVar3 = zVar.f18417c;
            int i7 = this.f18397c;
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
                    z7 = z8;
                }
            } else {
                z7 = z8;
            }
            if (yVar != yVar3) {
                int i10 = yVar.f18400c;
                int i11 = yVar.f18401d;
                if (i11 != -1) {
                    int i12 = motionLayout.f8844O;
                    if (i12 != i11 && i12 != i10) {
                        return;
                    }
                } else if (motionLayout.f8844O == i10) {
                    return;
                }
            }
            if (z7 && i8 != 0) {
                motionLayout.setTransition(yVar);
                motionLayout.k(1.0f);
                motionLayout.f8845O0 = null;
                return;
            }
            if (z4 && i9 != 0) {
                motionLayout.setTransition(yVar);
                motionLayout.k(0.0f);
            } else if (z7 && (i7 & 256) != 0) {
                motionLayout.setTransition(yVar);
                motionLayout.setProgress(1.0f);
            } else {
                if (!z4 || (i7 & 4096) == 0) {
                    return;
                }
                motionLayout.setTransition(yVar);
                motionLayout.setProgress(0.0f);
            }
        }
    }
}
