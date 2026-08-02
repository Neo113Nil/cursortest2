package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5054d implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertController f37112a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AlertController.b f37113b;

    C5054d(AlertController.b bVar, AlertController alertController) {
        this.f37113b = bVar;
        this.f37112a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        AlertController.b bVar = this.f37113b;
        DialogInterface.OnClickListener onClickListener = bVar.f37043s;
        AlertController alertController = this.f37112a;
        onClickListener.onClick(alertController.f36997b, i11);
        if (bVar.f37047w) {
            return;
        }
        alertController.f36997b.dismiss();
    }
}
