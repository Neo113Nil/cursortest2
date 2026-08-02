package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.k;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: N, reason: collision with root package name */
    private CharSequence f44455N;

    /* renamed from: O, reason: collision with root package name */
    private String f44456O;

    /* renamed from: P, reason: collision with root package name */
    private Drawable f44457P;

    /* renamed from: Q, reason: collision with root package name */
    private String f44458Q;

    /* renamed from: R, reason: collision with root package name */
    private String f44459R;

    /* renamed from: S, reason: collision with root package name */
    private int f44460S;

    public interface a {
        Preference e(@NonNull String str);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G4.f.f9702c, i11, 0);
        String string = obtainStyledAttributes.getString(9);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        this.f44455N = string;
        if (string == null) {
            this.f44455N = u();
        }
        String string2 = obtainStyledAttributes.getString(8);
        this.f44456O = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f44457P = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = obtainStyledAttributes.getString(11);
        this.f44458Q = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        String string4 = obtainStyledAttributes.getString(10);
        this.f44459R = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        this.f44460S = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void J() {
        r().p(this);
    }

    public final Drawable k0() {
        return this.f44457P;
    }

    public final int l0() {
        return this.f44460S;
    }

    public final String m0() {
        return this.f44456O;
    }

    public final CharSequence n0() {
        return this.f44455N;
    }

    public final String o0() {
        return this.f44459R;
    }

    public final String p0() {
        return this.f44458Q;
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle, context));
    }
}
