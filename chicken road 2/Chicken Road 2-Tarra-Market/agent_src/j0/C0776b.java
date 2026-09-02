package j0;

import C0.e;
import C0.n;
import C0.t;
import D0.f;
import k0.C0782b;
import z0.C0865a;
import z0.InterfaceC0866b;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0776b implements InterfaceC0866b {
    @Override // z0.InterfaceC0866b
    public final void onAttachedToEngine(C0865a c0865a) {
        f fVar = c0865a.f6801b;
        V.b bVar = new V.b(c0865a.f6800a);
        C0782b c0782b = C0782b.f6063a;
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.initVarioqubWithAppMetricaAdapter", c0782b, null).i(new e(7, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.fetchConfig", c0782b, null).i(new n(15, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.activateConfig", c0782b, null).i(new n(16, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getString", c0782b, null).i(new n(17, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getBoolean", c0782b, null).i(new n(18, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getInt", c0782b, null).i(new n(19, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getDouble", c0782b, null).i(new n(20, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getId", c0782b, null).i(new n(21, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.putClientFeature", c0782b, null).i(new n(11, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.clearClientFeatures", c0782b, null).i(new n(12, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getAllKeys", c0782b, null).i(new n(13, bVar));
        new t(fVar, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.setDefaults", c0782b, null).i(new n(14, bVar));
    }

    @Override // z0.InterfaceC0866b
    public final void onDetachedFromEngine(C0865a c0865a) {
    }
}
