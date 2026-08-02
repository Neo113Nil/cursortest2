package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.C5077w;

/* renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5078x implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5077w.e f38004a;

    C5078x(C5077w.e eVar) {
        this.f38004a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        C5077w.e eVar = this.f38004a;
        C5077w.this.setSelection(i11);
        if (C5077w.this.getOnItemClickListener() != null) {
            C5077w.this.performItemClick(view, i11, eVar.f37996C.getItemId(i11));
        }
        eVar.dismiss();
    }
}
