package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.core.content.res.k;
import androidx.preference.Preference;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: X, reason: collision with root package name */
    private CharSequence[] f44468X;

    /* renamed from: Y, reason: collision with root package name */
    private CharSequence[] f44469Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f44470Z;

    /* renamed from: r0, reason: collision with root package name */
    private String f44471r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f44472s0;

    public static final class b implements Preference.f<ListPreference> {

        /* renamed from: a, reason: collision with root package name */
        private static b f44474a;

        public static b b() {
            if (f44474a == null) {
                f44474a = new b();
            }
            return f44474a;
        }

        @Override // androidx.preference.Preference.f
        public final CharSequence a(ListPreference listPreference) {
            ListPreference listPreference2 = listPreference;
            return TextUtils.isEmpty(listPreference2.t0()) ? listPreference2.e().getString(R.string.not_set) : listPreference2.t0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9704e, i11, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f44468X = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.f44469Y = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            g0(b.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, G4.f.f9706g, i11, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.f44471r0 = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
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
        w0(aVar.f44473a);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable P() {
        super.P();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (A()) {
            return absSavedState;
        }
        a aVar = new a();
        aVar.f44473a = this.f44470Z;
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected final void Q(Object obj) {
        w0(p((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void f0(CharSequence charSequence) {
        super.f0(charSequence);
        if (charSequence == null && this.f44471r0 != null) {
            this.f44471r0 = null;
        } else {
            if (charSequence == null || charSequence.equals(this.f44471r0)) {
                return;
            }
            this.f44471r0 = ((String) charSequence).toString();
        }
    }

    public final int q0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f44469Y) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (charSequenceArr[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public final CharSequence[] r0() {
        return this.f44468X;
    }

    @Override // androidx.preference.Preference
    public final CharSequence s() {
        if (t() != null) {
            return t().a(this);
        }
        CharSequence t02 = t0();
        CharSequence s11 = super.s();
        String str = this.f44471r0;
        if (str != null) {
            if (t02 == null) {
                t02 = "";
            }
            String format = String.format(str, t02);
            if (!TextUtils.equals(format, s11)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return s11;
    }

    public final CharSequence t0() {
        CharSequence[] charSequenceArr;
        int q02 = q0(this.f44470Z);
        if (q02 < 0 || (charSequenceArr = this.f44468X) == null) {
            return null;
        }
        return charSequenceArr[q02];
    }

    public final CharSequence[] u0() {
        return this.f44469Y;
    }

    public final String v0() {
        return this.f44470Z;
    }

    public final void w0(String str) {
        boolean equals = TextUtils.equals(this.f44470Z, str);
        if (equals && this.f44472s0) {
            return;
        }
        this.f44470Z = str;
        this.f44472s0 = true;
        U(str);
        if (equals) {
            return;
        }
        C();
    }

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0809a();

        /* renamed from: a, reason: collision with root package name */
        String f44473a;

        /* renamed from: androidx.preference.ListPreference$a$a, reason: collision with other inner class name */
        static class C0809a implements Parcelable.Creator<a> {
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
            this.f44473a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f44473a);
        }

        a() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle, context));
    }
}
