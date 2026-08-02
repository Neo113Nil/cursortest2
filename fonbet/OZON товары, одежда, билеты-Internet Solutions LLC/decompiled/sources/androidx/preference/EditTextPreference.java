package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.core.content.res.k;
import androidx.preference.Preference;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: X, reason: collision with root package name */
    private String f44465X;

    public static final class b implements Preference.f<EditTextPreference> {

        /* renamed from: a, reason: collision with root package name */
        private static b f44467a;

        public static b b() {
            if (f44467a == null) {
                f44467a = new b();
            }
            return f44467a;
        }

        @Override // androidx.preference.Preference.f
        public final CharSequence a(EditTextPreference editTextPreference) {
            EditTextPreference editTextPreference2 = editTextPreference;
            return TextUtils.isEmpty(editTextPreference2.q0()) ? editTextPreference2.e().getString(R.string.not_set) : editTextPreference2.q0();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int a11 = k.a(R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle, context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9703d, a11, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            g0(b.b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Object L(TypedArray typedArray, int i11) {
        return typedArray.getString(i11);
    }

    @Override // androidx.preference.Preference
    protected final void O(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.O(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.O(aVar.getSuperState());
        r0(aVar.f44466a);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable P() {
        super.P();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (A()) {
            return absSavedState;
        }
        a aVar = new a();
        aVar.f44466a = this.f44465X;
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected final void Q(Object obj) {
        r0(p((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean i0() {
        return TextUtils.isEmpty(this.f44465X) || super.i0();
    }

    public final String q0() {
        return this.f44465X;
    }

    public final void r0(String str) {
        boolean i02 = i0();
        this.f44465X = str;
        U(str);
        boolean i03 = i0();
        if (i03 != i02) {
            D(i03);
        }
        C();
    }

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0808a();

        /* renamed from: a, reason: collision with root package name */
        String f44466a;

        /* renamed from: androidx.preference.EditTextPreference$a$a, reason: collision with other inner class name */
        static class C0808a implements Parcelable.Creator<a> {
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
            this.f44466a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f44466a);
        }

        a() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
