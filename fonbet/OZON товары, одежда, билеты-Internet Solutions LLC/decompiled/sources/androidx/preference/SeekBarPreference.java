package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: N, reason: collision with root package name */
    int f44528N;

    /* renamed from: O, reason: collision with root package name */
    int f44529O;

    /* renamed from: P, reason: collision with root package name */
    private int f44530P;

    /* renamed from: Q, reason: collision with root package name */
    private int f44531Q;

    /* renamed from: R, reason: collision with root package name */
    boolean f44532R;

    /* renamed from: S, reason: collision with root package name */
    SeekBar f44533S;

    /* renamed from: X, reason: collision with root package name */
    private TextView f44534X;

    /* renamed from: Y, reason: collision with root package name */
    boolean f44535Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f44536Z;

    /* renamed from: r0, reason: collision with root package name */
    boolean f44537r0;

    /* renamed from: s0, reason: collision with root package name */
    private SeekBar.OnSeekBarChangeListener f44538s0;

    /* renamed from: t0, reason: collision with root package name */
    private View.OnKeyListener f44539t0;

    final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (!z11 || (!seekBarPreference.f44537r0 && seekBarPreference.f44532R)) {
                seekBarPreference.m0(i11 + seekBarPreference.f44529O);
            } else {
                seekBarPreference.l0(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f44532R = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            seekBarPreference.f44532R = false;
            if (seekBar.getProgress() + seekBarPreference.f44529O != seekBarPreference.f44528N) {
                seekBarPreference.l0(seekBar);
            }
        }
    }

    final class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f44535Y && (i11 == 21 || i11 == 22)) || i11 == 23 || i11 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f44533S;
            if (seekBar != null) {
                return seekBar.onKeyDown(i11, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.f44538s0 = new a();
        this.f44539t0 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9710k, R.attr.seekBarPreferenceStyle, 0);
        this.f44529O = obtainStyledAttributes.getInt(3, 0);
        int i11 = obtainStyledAttributes.getInt(1, 100);
        int i12 = this.f44529O;
        i11 = i11 < i12 ? i12 : i11;
        if (i11 != this.f44530P) {
            this.f44530P = i11;
            C();
        }
        int i13 = obtainStyledAttributes.getInt(4, 0);
        if (i13 != this.f44531Q) {
            this.f44531Q = Math.min(this.f44530P - this.f44529O, Math.abs(i13));
            C();
        }
        this.f44535Y = obtainStyledAttributes.getBoolean(2, true);
        this.f44536Z = obtainStyledAttributes.getBoolean(5, false);
        this.f44537r0 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    private void k0(int i11, boolean z11) {
        int i12 = this.f44529O;
        if (i11 < i12) {
            i11 = i12;
        }
        int i13 = this.f44530P;
        if (i11 > i13) {
            i11 = i13;
        }
        if (i11 != this.f44528N) {
            this.f44528N = i11;
            m0(i11);
            T(i11);
            if (z11) {
                C();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void I(h hVar) {
        super.I(hVar);
        hVar.itemView.setOnKeyListener(this.f44539t0);
        this.f44533S = (SeekBar) hVar.e(R.id.seekbar);
        TextView textView = (TextView) hVar.e(R.id.seekbar_value);
        this.f44534X = textView;
        if (this.f44536Z) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f44534X = null;
        }
        SeekBar seekBar = this.f44533S;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f44538s0);
        this.f44533S.setMax(this.f44530P - this.f44529O);
        int i11 = this.f44531Q;
        if (i11 != 0) {
            this.f44533S.setKeyProgressIncrement(i11);
        } else {
            this.f44531Q = this.f44533S.getKeyProgressIncrement();
        }
        this.f44533S.setProgress(this.f44528N - this.f44529O);
        m0(this.f44528N);
        this.f44533S.setEnabled(z());
    }

    @Override // androidx.preference.Preference
    protected final Object L(TypedArray typedArray, int i11) {
        return Integer.valueOf(typedArray.getInt(i11, 0));
    }

    @Override // androidx.preference.Preference
    protected final void O(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.O(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.O(cVar.getSuperState());
        this.f44528N = cVar.f44542a;
        this.f44529O = cVar.f44543b;
        this.f44530P = cVar.f44544c;
        C();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable P() {
        super.P();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (A()) {
            return absSavedState;
        }
        c cVar = new c();
        cVar.f44542a = this.f44528N;
        cVar.f44543b = this.f44529O;
        cVar.f44544c = this.f44530P;
        return cVar;
    }

    @Override // androidx.preference.Preference
    protected final void Q(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        k0(o(((Integer) obj).intValue()), true);
    }

    final void l0(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f44529O;
        if (progress != this.f44528N) {
            b(Integer.valueOf(progress));
            k0(progress, false);
        }
    }

    final void m0(int i11) {
        TextView textView = this.f44534X;
        if (textView != null) {
            textView.setText(String.valueOf(i11));
        }
    }

    private static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f44542a;

        /* renamed from: b, reason: collision with root package name */
        int f44543b;

        /* renamed from: c, reason: collision with root package name */
        int f44544c;

        static class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.f44542a = parcel.readInt();
            this.f44543b = parcel.readInt();
            this.f44544c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f44542a);
            parcel.writeInt(this.f44543b);
            parcel.writeInt(this.f44544c);
        }

        c() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
