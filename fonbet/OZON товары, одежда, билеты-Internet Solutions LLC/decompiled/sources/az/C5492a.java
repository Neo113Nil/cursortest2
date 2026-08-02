package az;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.factory.MapCommonComponentFactoryModule;

/* renamed from: az.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C5492a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        MapCommonComponentApi bindMapCommonComponentFactory$lambda$0;
        bindMapCommonComponentFactory$lambda$0 = MapCommonComponentFactoryModule.bindMapCommonComponentFactory$lambda$0(c6740b);
        return bindMapCommonComponentFactory$lambda$0;
    }
}
