package com.door.brass.knob.data.repository;

import com.door.brass.knob.data.db.dao.DessertConfigDao;
import com.door.brass.knob.data.db.entity.DessertConfigEntity;
import com.door.brass.knob.data.device.PantrySignalCollector;
import com.door.brass.knob.data.remote.MeringueSocketClient;
import com.door.brass.knob.data.remote.dto.DessertMenuResponse;
import com.door.brass.knob.data.remote.dto.DessertProbeRequest;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/repository/SplashRepository;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplashRepository {
    public final PantrySignalCollector hRNgd2zGCE5kj;
    public final MeringueSocketClient ra306ClFT3HT;
    public final DessertConfigDao yzPsTade5rL7D3;

    public SplashRepository(DessertConfigDao dessertConfigDao, PantrySignalCollector pantrySignalCollector, MeringueSocketClient meringueSocketClient) {
        pantrySignalCollector.getClass();
        meringueSocketClient.getClass();
        this.yzPsTade5rL7D3 = dessertConfigDao;
        this.hRNgd2zGCE5kj = pantrySignalCollector;
        this.ra306ClFT3HT = meringueSocketClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r14 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object yzPsTade5rL7D3(ContinuationImpl continuationImpl) {
        SplashRepository$fetchConfig$1 splashRepository$fetchConfig$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        SplashRepository splashRepository;
        if (continuationImpl instanceof SplashRepository$fetchConfig$1) {
            splashRepository$fetchConfig$1 = (SplashRepository$fetchConfig$1) continuationImpl;
            int i2 = splashRepository$fetchConfig$1.UEutaskTsxaI;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splashRepository$fetchConfig$1.UEutaskTsxaI = i2 - Integer.MIN_VALUE;
                obj = splashRepository$fetchConfig$1.Uo5pffGf8LUU;
                coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
                i = splashRepository$fetchConfig$1.UEutaskTsxaI;
                if (i != 0) {
                    ResultKt.hRNgd2zGCE5kj(obj);
                    splashRepository$fetchConfig$1.UEutaskTsxaI = 1;
                    obj = this.hRNgd2zGCE5kj.yzPsTade5rL7D3(splashRepository$fetchConfig$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            DessertConfigEntity dessertConfigEntity = (DessertConfigEntity) splashRepository$fetchConfig$1.i7xAcZoXXiIt;
                            ResultKt.hRNgd2zGCE5kj(obj);
                            return dessertConfigEntity;
                        }
                        splashRepository = (SplashRepository) splashRepository$fetchConfig$1.i7xAcZoXXiIt;
                        ResultKt.hRNgd2zGCE5kj(obj);
                        DessertMenuResponse dessertMenuResponse = (DessertMenuResponse) obj;
                        splashRepository.getClass();
                        String hRNgd2zGCE5kj = dessertMenuResponse.hRNgd2zGCE5kj();
                        DessertConfigEntity dessertConfigEntity2 = new DessertConfigEntity(1, hRNgd2zGCE5kj, hRNgd2zGCE5kj != null, dessertMenuResponse.getIsZesty(), dessertMenuResponse.getHasMeringue(), dessertMenuResponse.getIsSeasonal());
                        splashRepository$fetchConfig$1.i7xAcZoXXiIt = dessertConfigEntity2;
                        splashRepository$fetchConfig$1.UEutaskTsxaI = 3;
                        return this.yzPsTade5rL7D3.hRNgd2zGCE5kj(dessertConfigEntity2, splashRepository$fetchConfig$1) != coroutineSingletons ? coroutineSingletons : dessertConfigEntity2;
                    }
                    ResultKt.hRNgd2zGCE5kj(obj);
                }
                splashRepository$fetchConfig$1.i7xAcZoXXiIt = this;
                splashRepository$fetchConfig$1.UEutaskTsxaI = 2;
                obj = this.ra306ClFT3HT.hRNgd2zGCE5kj((DessertProbeRequest) obj, splashRepository$fetchConfig$1);
                if (obj != coroutineSingletons) {
                    splashRepository = this;
                    DessertMenuResponse dessertMenuResponse2 = (DessertMenuResponse) obj;
                    splashRepository.getClass();
                    String hRNgd2zGCE5kj2 = dessertMenuResponse2.hRNgd2zGCE5kj();
                    DessertConfigEntity dessertConfigEntity22 = new DessertConfigEntity(1, hRNgd2zGCE5kj2, hRNgd2zGCE5kj2 != null, dessertMenuResponse2.getIsZesty(), dessertMenuResponse2.getHasMeringue(), dessertMenuResponse2.getIsSeasonal());
                    splashRepository$fetchConfig$1.i7xAcZoXXiIt = dessertConfigEntity22;
                    splashRepository$fetchConfig$1.UEutaskTsxaI = 3;
                    if (this.yzPsTade5rL7D3.hRNgd2zGCE5kj(dessertConfigEntity22, splashRepository$fetchConfig$1) != coroutineSingletons) {
                    }
                }
            }
        }
        splashRepository$fetchConfig$1 = new SplashRepository$fetchConfig$1(this, continuationImpl);
        obj = splashRepository$fetchConfig$1.Uo5pffGf8LUU;
        coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        i = splashRepository$fetchConfig$1.UEutaskTsxaI;
        if (i != 0) {
        }
        splashRepository$fetchConfig$1.i7xAcZoXXiIt = this;
        splashRepository$fetchConfig$1.UEutaskTsxaI = 2;
        obj = this.ra306ClFT3HT.hRNgd2zGCE5kj((DessertProbeRequest) obj, splashRepository$fetchConfig$1);
        if (obj != coroutineSingletons) {
        }
    }
}
