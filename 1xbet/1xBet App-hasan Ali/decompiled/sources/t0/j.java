package t0;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19485a;

    /* renamed from: b, reason: collision with root package name */
    public final D3.l f19486b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19487c;

    /* renamed from: d, reason: collision with root package name */
    public int f19488d;

    public j(List list, D3.l lVar) {
        this.f19485a = list;
        this.f19486b = lVar;
        if (Build.VERSION.SDK_INT >= 29) {
            MotionEvent motionEvent = lVar != null ? (MotionEvent) ((G.v) lVar.f963n).f1750m : null;
            if (motionEvent != null) {
                motionEvent.getClassification();
            }
        }
        MotionEvent motionEvent2 = lVar != null ? (MotionEvent) ((G.v) lVar.f963n).f1750m : null;
        int i = 0;
        this.f19487c = motionEvent2 != null ? motionEvent2.getButtonState() : 0;
        MotionEvent motionEvent3 = lVar != null ? (MotionEvent) ((G.v) lVar.f963n).f1750m : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = lVar != null ? (MotionEvent) ((G.v) lVar.f963n).f1750m : null;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = list.size();
            while (i < size) {
                s sVar = (s) list.get(i);
                if (q.c(sVar)) {
                    i = 2;
                } else if (q.a(sVar)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.f19488d = i;
    }
}
