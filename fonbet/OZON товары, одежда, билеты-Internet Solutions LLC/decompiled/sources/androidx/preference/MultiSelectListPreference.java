package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.core.content.res.k;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: X, reason: collision with root package name */
    private CharSequence[] f44475X;

    /* renamed from: Y, reason: collision with root package name */
    private CharSequence[] f44476Y;

    /* renamed from: Z, reason: collision with root package name */
    private HashSet f44477Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int a11 = k.a(R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle, context);
        this.f44477Z = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9705f, a11, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f44475X = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.f44476Y = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Object L(TypedArray typedArray, int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i11);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void O(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.O(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.O(aVar.getSuperState());
        u0(aVar.f44478a);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable P() {
        super.P();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (A()) {
            return absSavedState;
        }
        a aVar = new a();
        aVar.f44478a = this.f44477Z;
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected final void Q(Object obj) {
        u0(q((Set) obj));
    }

    public final CharSequence[] q0() {
        return this.f44475X;
    }

    public final CharSequence[] r0() {
        return this.f44476Y;
    }

    public final HashSet t0() {
        return this.f44477Z;
    }

    public final void u0(Set<String> set) {
        HashSet hashSet = this.f44477Z;
        hashSet.clear();
        hashSet.addAll(set);
        V(set);
        C();
    }

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0810a();

        /* renamed from: a, reason: collision with root package name */
        HashSet f44478a;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a, reason: collision with other inner class name */
        static class C0810a implements Parcelable.Creator<a> {
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
            int readInt = parcel.readInt();
            this.f44478a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f44478a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f44478a.size());
            HashSet hashSet = this.f44478a;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }

        a() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
