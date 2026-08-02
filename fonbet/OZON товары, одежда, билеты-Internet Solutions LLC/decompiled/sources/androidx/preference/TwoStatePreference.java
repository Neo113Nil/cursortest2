package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: classes8.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: N, reason: collision with root package name */
    protected boolean f44553N;

    /* renamed from: O, reason: collision with root package name */
    private String f44554O;

    /* renamed from: P, reason: collision with root package name */
    private String f44555P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f44556Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f44557R;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    protected final void J() {
        boolean z11 = !this.f44553N;
        b(Boolean.valueOf(z11));
        l0(z11);
    }

    @Override // androidx.preference.Preference
    protected final Object L(TypedArray typedArray, int i11) {
        return Boolean.valueOf(typedArray.getBoolean(i11, false));
    }

    @Override // androidx.preference.Preference
    protected final void O(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.O(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.O(aVar.getSuperState());
        l0(aVar.f44558a);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable P() {
        super.P();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (A()) {
            return absSavedState;
        }
        a aVar = new a();
        aVar.f44558a = this.f44553N;
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected final void Q(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        l0(n(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean i0() {
        return (this.f44557R ? this.f44553N : !this.f44553N) || super.i0();
    }

    public final boolean k0() {
        return this.f44553N;
    }

    public final void l0(boolean z11) {
        boolean z12 = this.f44553N != z11;
        if (z12 || !this.f44556Q) {
            this.f44553N = z11;
            this.f44556Q = true;
            S(z11);
            if (z12) {
                D(i0());
                C();
            }
        }
    }

    public final void m0(boolean z11) {
        this.f44557R = z11;
    }

    public final void n0(String str) {
        this.f44555P = str;
        if (this.f44553N) {
            return;
        }
        C();
    }

    public final void o0(String str) {
        this.f44554O = str;
        if (this.f44553N) {
            C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void p0(View view) {
        boolean z11;
        int i11;
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        if (this.f44553N && !TextUtils.isEmpty(this.f44554O)) {
            textView.setText(this.f44554O);
        } else {
            if (this.f44553N || TextUtils.isEmpty(this.f44555P)) {
                z11 = true;
                if (z11) {
                    CharSequence s11 = s();
                    if (!TextUtils.isEmpty(s11)) {
                        textView.setText(s11);
                        z11 = false;
                    }
                }
                i11 = z11 ? 8 : 0;
                if (i11 == textView.getVisibility()) {
                    textView.setVisibility(i11);
                    return;
                }
                return;
            }
            textView.setText(this.f44555P);
        }
        z11 = false;
        if (z11) {
        }
        if (z11) {
        }
        if (i11 == textView.getVisibility()) {
        }
    }

    static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0812a();

        /* renamed from: a, reason: collision with root package name */
        boolean f44558a;

        /* renamed from: androidx.preference.TwoStatePreference$a$a, reason: collision with other inner class name */
        static class C0812a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        a(Parcel parcel) {
            super(parcel);
            this.f44558a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f44558a ? 1 : 0);
        }

        a() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
