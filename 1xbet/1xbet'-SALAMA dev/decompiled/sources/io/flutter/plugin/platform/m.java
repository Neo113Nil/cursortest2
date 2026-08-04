package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.plugin.editing.TextInputPlugin;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f14166c;

    public /* synthetic */ m(l lVar, int i7, int i8) {
        this.f14164a = i8;
        this.f14166c = lVar;
        this.f14165b = i7;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f14164a) {
            case 0:
                s sVar = (s) this.f14166c;
                int i7 = this.f14165b;
                if (!z4) {
                    TextInputPlugin textInputPlugin = sVar.f14197f;
                    if (textInputPlugin != null) {
                        textInputPlugin.clearPlatformViewClient(i7);
                    }
                    break;
                } else {
                    A5.s sVar2 = (A5.s) sVar.f14198g.f12447b;
                    if (sVar2 != null) {
                        sVar2.a("viewFocused", Integer.valueOf(i7), null);
                        break;
                    }
                }
                break;
            default:
                r rVar = (r) this.f14166c;
                int i8 = this.f14165b;
                if (!z4) {
                    TextInputPlugin textInputPlugin2 = rVar.f14181f;
                    if (textInputPlugin2 != null) {
                        textInputPlugin2.clearPlatformViewClient(i8);
                    }
                    break;
                } else {
                    A5.s sVar3 = (A5.s) rVar.f14182g.f11335b;
                    if (sVar3 != null) {
                        sVar3.a("viewFocused", Integer.valueOf(i8), null);
                        break;
                    }
                }
                break;
        }
    }
}
