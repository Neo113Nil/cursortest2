package O0;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class o extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final int f19792a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f19793b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f19794c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final q f19795d;

    /* renamed from: e, reason: collision with root package name */
    private int f19796e;

    public o(@NotNull Context context) {
        super(context);
        this.f19792a = 5;
        ArrayList arrayList = new ArrayList();
        this.f19793b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f19794c = arrayList2;
        this.f19795d = new q();
        setClipChildren(false);
        r rVar = new r(context);
        addView(rVar);
        arrayList.add(rVar);
        arrayList2.add(rVar);
        this.f19796e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(@NotNull p pVar) {
        pVar.o1();
        q qVar = this.f19795d;
        r b11 = qVar.b(pVar);
        if (b11 != null) {
            b11.c();
            qVar.c(pVar);
            this.f19794c.add(b11);
        }
    }

    @NotNull
    public final r b(@NotNull p pVar) {
        q qVar = this.f19795d;
        r b11 = qVar.b(pVar);
        if (b11 != null) {
            return b11;
        }
        r rVar = (r) C7714v.v0(this.f19794c);
        if (rVar == null) {
            int i11 = this.f19796e;
            ArrayList arrayList = this.f19793b;
            if (i11 > C7714v.P(arrayList)) {
                rVar = new r(getContext());
                addView(rVar);
                arrayList.add(rVar);
            } else {
                rVar = (r) arrayList.get(this.f19796e);
                p a11 = qVar.a(rVar);
                if (a11 != null) {
                    a11.o1();
                    qVar.c(a11);
                    rVar.c();
                }
            }
            int i12 = this.f19796e;
            if (i12 < this.f19792a - 1) {
                this.f19796e = i12 + 1;
            } else {
                this.f19796e = 0;
            }
        }
        qVar.d(pVar, rVar);
        return rVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
