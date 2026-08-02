package G4;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.f;
import androidx.preference.ListPreference;

/* loaded from: classes8.dex */
public class b extends androidx.preference.b {

    /* renamed from: i, reason: collision with root package name */
    int f9687i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence[] f9688j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence[] f9689k;

    final class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            b bVar = b.this;
            bVar.f9687i = i11;
            bVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Override // androidx.preference.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f9687i = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f9688j = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f9689k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) t();
        if (listPreference.r0() == null || listPreference.u0() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f9687i = listPreference.q0(listPreference.v0());
        this.f9688j = listPreference.r0();
        this.f9689k = listPreference.u0();
    }

    @Override // androidx.preference.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f9687i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f9688j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f9689k);
    }

    @Override // androidx.preference.b
    public final void v(boolean z11) {
        int i11;
        if (!z11 || (i11 = this.f9687i) < 0) {
            return;
        }
        String charSequence = this.f9689k[i11].toString();
        ListPreference listPreference = (ListPreference) t();
        listPreference.b(charSequence);
        listPreference.w0(charSequence);
    }

    @Override // androidx.preference.b
    protected final void w(f.a aVar) {
        aVar.o(this.f9688j, this.f9687i, new a());
        aVar.m(null, null);
    }
}
