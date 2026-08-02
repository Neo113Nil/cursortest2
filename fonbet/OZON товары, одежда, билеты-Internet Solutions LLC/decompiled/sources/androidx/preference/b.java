package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.f;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.r;
import androidx.lifecycle.InterfaceC5431s;
import androidx.preference.DialogPreference;

/* loaded from: classes8.dex */
public abstract class b extends DialogInterfaceOnCancelListenerC5390k implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private DialogPreference f44560a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f44561b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f44562c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f44563d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f44564e;

    /* renamed from: f, reason: collision with root package name */
    private int f44565f;

    /* renamed from: g, reason: collision with root package name */
    private BitmapDrawable f44566g;

    /* renamed from: h, reason: collision with root package name */
    private int f44567h;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f44567h = i11;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC5431s targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.f44561b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f44562c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f44563d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f44564e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f44565f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f44566g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.e(string);
        this.f44560a = dialogPreference;
        this.f44561b = dialogPreference.n0();
        this.f44562c = this.f44560a.p0();
        this.f44563d = this.f44560a.o0();
        this.f44564e = this.f44560a.m0();
        this.f44565f = this.f44560a.l0();
        Drawable k02 = this.f44560a.k0();
        if (k02 == null || (k02 instanceof BitmapDrawable)) {
            this.f44566g = (BitmapDrawable) k02;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(k02.getIntrinsicWidth(), k02.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        k02.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        k02.draw(canvas);
        this.f44566g = new BitmapDrawable(getResources(), createBitmap);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        r activity = getActivity();
        this.f44567h = -2;
        f.a h11 = new f.a(activity).setTitle(this.f44561b).d(this.f44566g).m(this.f44562c, this).h(this.f44563d, this);
        int i11 = this.f44565f;
        View inflate = i11 != 0 ? LayoutInflater.from(activity).inflate(i11, (ViewGroup) null) : null;
        if (inflate != null) {
            u(inflate);
            h11.setView(inflate);
        } else {
            h11.f(this.f44564e);
        }
        w(h11);
        androidx.appcompat.app.f create = h11.create();
        if (this instanceof G4.a) {
            create.getWindow().setSoftInputMode(5);
        }
        return create;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        v(this.f44567h == -1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f44561b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f44562c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f44563d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f44564e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f44565f);
        BitmapDrawable bitmapDrawable = this.f44566g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public final DialogPreference t() {
        if (this.f44560a == null) {
            this.f44560a = (DialogPreference) ((DialogPreference.a) getTargetFragment()).e(getArguments().getString("key"));
        }
        return this.f44560a;
    }

    protected void u(View view) {
        int i11;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.f44564e;
            if (TextUtils.isEmpty(charSequence)) {
                i11 = 8;
            } else {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i11 = 0;
            }
            if (findViewById.getVisibility() != i11) {
                findViewById.setVisibility(i11);
            }
        }
    }

    public abstract void v(boolean z11);

    protected void w(f.a aVar) {
    }
}
