package com.google.zxing.datamatrix.encoder;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes8.dex */
final class DataMatrixSymbolInfo144 extends SymbolInfo {
    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getDataLengthForInterleavedBlock(int i) {
        if (i <= 8) {
            return 156;
        }
        return ModuleDescriptor.MODULE_VERSION;
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getInterleavedBlockCount() {
        return 10;
    }

    DataMatrixSymbolInfo144() {
        super(false, 1558, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 22, 22, 36, -1, 62);
    }
}
