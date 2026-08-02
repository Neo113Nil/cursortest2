package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.validator;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/validator/DataStorageDirectoryValidator;", "Lcom/discover/mpos/sdk/core/emv/Validator;", "", "()V", "dataStorageDirectoryLength", "", "unpredictableNumberLength", "validDirectoryEntriesCountRange", "Lkotlin/ranges/IntRange;", "isValid", "", "toValidate", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.d.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DataStorageDirectoryValidator implements com.discover.mpos.sdk.core.emv.Validator<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final int f3201a = 8;
    private final int b = 10;
    private final kotlin.ranges.IntRange c = new kotlin.ranges.IntRange(0, 24);

    @Override // com.discover.mpos.sdk.core.emv.Validator
    public final /* synthetic */ boolean isValid(byte[] bArr) {
        byte[] bArr2 = bArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        int length = bArr2.length;
        int i = this.f3201a;
        boolean z = false;
        boolean z2 = length >= i;
        int length2 = bArr2.length;
        int i2 = this.b;
        boolean z3 = (length2 - i) % i2 == 0;
        int length3 = (bArr2.length - i) / i2;
        if (z2 && z3 && this.c.contains(length3)) {
            z = true;
        }
        new java.lang.Object[]{bArr2};
        new java.lang.Object[]{java.lang.Integer.valueOf(length3)};
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        return z;
    }
}
