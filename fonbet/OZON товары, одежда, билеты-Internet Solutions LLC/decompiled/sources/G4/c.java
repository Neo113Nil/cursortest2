package G4;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.f;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes8.dex */
public class c extends androidx.preference.b {

    /* renamed from: i, reason: collision with root package name */
    HashSet f9691i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    boolean f9692j;

    /* renamed from: k, reason: collision with root package name */
    CharSequence[] f9693k;

    /* renamed from: l, reason: collision with root package name */
    CharSequence[] f9694l;

    final class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i11, boolean z11) {
            c cVar = c.this;
            if (z11) {
                cVar.f9692j = cVar.f9691i.add(cVar.f9694l[i11].toString()) | cVar.f9692j;
            } else {
                cVar.f9692j = cVar.f9691i.remove(cVar.f9694l[i11].toString()) | cVar.f9692j;
            }
        }
    }

    @Override // androidx.preference.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f9691i;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f9692j = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f9693k = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f9694l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) t();
        if (multiSelectListPreference.q0() == null || multiSelectListPreference.r0() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.t0());
        this.f9692j = false;
        this.f9693k = multiSelectListPreference.q0();
        this.f9694l = multiSelectListPreference.r0();
    }

    @Override // androidx.preference.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f9691i));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f9692j);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f9693k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f9694l);
    }

    @Override // androidx.preference.b
    public final void v(boolean z11) {
        if (z11 && this.f9692j) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) t();
            HashSet hashSet = this.f9691i;
            multiSelectListPreference.b(hashSet);
            multiSelectListPreference.u0(hashSet);
        }
        this.f9692j = false;
    }

    @Override // androidx.preference.b
    protected final void w(f.a aVar) {
        int length = this.f9694l.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zArr[i11] = this.f9691i.contains(this.f9694l[i11].toString());
        }
        aVar.g(this.f9693k, zArr, new a());
    }
}
