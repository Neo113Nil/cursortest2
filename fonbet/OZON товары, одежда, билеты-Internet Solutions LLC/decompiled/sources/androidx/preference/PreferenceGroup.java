package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.collection.Z;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes8.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: N, reason: collision with root package name */
    final Z<String, Long> f44520N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f44521O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f44522P;

    /* renamed from: Q, reason: collision with root package name */
    private int f44523Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f44524R;

    /* renamed from: S, reason: collision with root package name */
    private int f44525S;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44520N = new Z<>();
        new Handler();
        this.f44522P = true;
        this.f44523Q = 0;
        this.f44524R = false;
        this.f44525S = Integer.MAX_VALUE;
        this.f44521O = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9708i, i11, 0);
        this.f44522P = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            p0(obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void D(boolean z11) {
        super.D(z11);
        int size = this.f44521O.size();
        for (int i11 = 0; i11 < size; i11++) {
            n0(i11).N(z11);
        }
    }

    @Override // androidx.preference.Preference
    public final void F() {
        super.F();
        this.f44524R = true;
        int size = this.f44521O.size();
        for (int i11 = 0; i11 < size; i11++) {
            n0(i11).F();
        }
    }

    @Override // androidx.preference.Preference
    public final void K() {
        super.K();
        this.f44524R = false;
        int size = this.f44521O.size();
        for (int i11 = 0; i11 < size; i11++) {
            n0(i11).K();
        }
    }

    @Override // androidx.preference.Preference
    protected final void O(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.O(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        this.f44525S = aVar.f44526a;
        super.O(aVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    protected final Parcelable P() {
        super.P();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new a(this.f44525S);
    }

    @Override // androidx.preference.Preference
    protected final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.f44521O.size();
        for (int i11 = 0; i11 < size; i11++) {
            n0(i11).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected final void d(Bundle bundle) {
        super.d(bundle);
        int size = this.f44521O.size();
        for (int i11 = 0; i11 < size; i11++) {
            n0(i11).d(bundle);
        }
    }

    public final void k0(Preference preference) {
        long d11;
        if (this.f44521O.contains(preference)) {
            return;
        }
        if (preference.j() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.m() != null) {
                preferenceGroup = preferenceGroup.m();
            }
            String j11 = preference.j();
            if (preferenceGroup.l0(j11) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + j11 + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.l() == Integer.MAX_VALUE) {
            if (this.f44522P) {
                int i11 = this.f44523Q;
                this.f44523Q = i11 + 1;
                preference.e0(i11);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).f44522P = this.f44522P;
            }
        }
        int binarySearch = Collections.binarySearch(this.f44521O, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        preference.N(i0());
        synchronized (this) {
            this.f44521O.add(binarySearch, preference);
        }
        g r11 = r();
        String j12 = preference.j();
        if (j12 == null || !this.f44520N.containsKey(j12)) {
            d11 = r11.d();
        } else {
            d11 = this.f44520N.get(j12).longValue();
            this.f44520N.remove(j12);
        }
        preference.H(r11, d11);
        preference.a(this);
        if (this.f44524R) {
            preference.F();
        }
        E();
    }

    public final Preference l0(@NonNull String str) {
        Preference l02;
        if (str == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(j(), str)) {
            return this;
        }
        int size = this.f44521O.size();
        for (int i11 = 0; i11 < size; i11++) {
            Preference n02 = n0(i11);
            if (TextUtils.equals(n02.j(), str)) {
                return n02;
            }
            if ((n02 instanceof PreferenceGroup) && (l02 = ((PreferenceGroup) n02).l0(str)) != null) {
                return l02;
            }
        }
        return null;
    }

    public final int m0() {
        return this.f44525S;
    }

    public final Preference n0(int i11) {
        return (Preference) this.f44521O.get(i11);
    }

    public final int o0() {
        return this.f44521O.size();
    }

    public final void p0(int i11) {
        if (i11 != Integer.MAX_VALUE && !w()) {
            Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
        }
        this.f44525S = i11;
    }

    final void q0() {
        synchronized (this) {
            Collections.sort(this.f44521O);
        }
    }

    static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0811a();

        /* renamed from: a, reason: collision with root package name */
        int f44526a;

        /* renamed from: androidx.preference.PreferenceGroup$a$a, reason: collision with other inner class name */
        static class C0811a implements Parcelable.Creator<a> {
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
            this.f44526a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f44526a);
        }

        a(int i11) {
            super(AbsSavedState.EMPTY_STATE);
            this.f44526a = i11;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
