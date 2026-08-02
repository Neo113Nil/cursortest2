package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5471e implements u {

    /* renamed from: a, reason: collision with root package name */
    final u f44862a;

    /* renamed from: b, reason: collision with root package name */
    int f44863b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f44864c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f44865d = -1;

    /* renamed from: e, reason: collision with root package name */
    Object f44866e = null;

    public C5471e(@NonNull u uVar) {
        this.f44862a = uVar;
    }

    public final void a() {
        int i11 = this.f44863b;
        if (i11 == 0) {
            return;
        }
        u uVar = this.f44862a;
        if (i11 == 1) {
            uVar.onInserted(this.f44864c, this.f44865d);
        } else if (i11 == 2) {
            uVar.onRemoved(this.f44864c, this.f44865d);
        } else if (i11 == 3) {
            uVar.onChanged(this.f44864c, this.f44865d, this.f44866e);
        }
        this.f44866e = null;
        this.f44863b = 0;
    }

    @Override // androidx.recyclerview.widget.u
    public final void onChanged(int i11, int i12, Object obj) {
        int i13;
        int i14;
        int i15;
        if (this.f44863b == 3 && i11 <= (i14 = this.f44865d + (i13 = this.f44864c)) && (i15 = i11 + i12) >= i13 && this.f44866e == obj) {
            this.f44864c = Math.min(i11, i13);
            this.f44865d = Math.max(i14, i15) - this.f44864c;
            return;
        }
        a();
        this.f44864c = i11;
        this.f44865d = i12;
        this.f44866e = obj;
        this.f44863b = 3;
    }

    @Override // androidx.recyclerview.widget.u
    public final void onInserted(int i11, int i12) {
        int i13;
        if (this.f44863b == 1 && i11 >= (i13 = this.f44864c)) {
            int i14 = this.f44865d;
            if (i11 <= i13 + i14) {
                this.f44865d = i14 + i12;
                this.f44864c = Math.min(i11, i13);
                return;
            }
        }
        a();
        this.f44864c = i11;
        this.f44865d = i12;
        this.f44863b = 1;
    }

    @Override // androidx.recyclerview.widget.u
    public final void onMoved(int i11, int i12) {
        a();
        this.f44862a.onMoved(i11, i12);
    }

    @Override // androidx.recyclerview.widget.u
    public final void onRemoved(int i11, int i12) {
        int i13;
        if (this.f44863b == 2 && (i13 = this.f44864c) >= i11 && i13 <= i11 + i12) {
            this.f44865d += i12;
            this.f44864c = i11;
        } else {
            a();
            this.f44864c = i11;
            this.f44865d = i12;
            this.f44863b = 2;
        }
    }
}
