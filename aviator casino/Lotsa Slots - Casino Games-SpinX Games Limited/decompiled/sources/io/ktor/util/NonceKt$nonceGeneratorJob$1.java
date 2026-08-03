package io.ktor.util;

/* compiled from: Nonce.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", f = "Nonce.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {76}, m = "invokeSuspend", n = {"seedChannel", "previousRoundNonceList", "secureInstance", "weakRandom", "secureBytes", "weakBytes", "randomNonceList", "lastReseed", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
/* loaded from: classes6.dex */
final class NonceKt$nonceGeneratorJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int I$0;
    int I$1;
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    int label;

    NonceKt$nonceGeneratorJob$1(kotlin.coroutines.Continuation<? super io.ktor.util.NonceKt$nonceGeneratorJob$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.util.NonceKt$nonceGeneratorJob$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.NonceKt$nonceGeneratorJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d9 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00fd, B:10:0x00d9, B:14:0x00ff, B:16:0x010e, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ff A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00fd, B:10:0x00d9, B:14:0x00ff, B:16:0x010e, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[Catch: all -> 0x0040, LOOP:1: B:21:0x007c->B:22:0x007e, LOOP_END, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00fd, B:10:0x00d9, B:14:0x00ff, B:16:0x010e, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00fd, B:10:0x00d9, B:14:0x00ff, B:16:0x010e, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:8:0x00fd, B:10:0x00d9, B:14:0x00ff, B:16:0x010e, B:20:0x0073, B:22:0x007e, B:24:0x0087, B:26:0x0093, B:27:0x00a4, B:28:0x00a1), top: B:5:0x002f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00fa -> B:8:0x00fd). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.security.SecureRandom lookupSecureRandom;
        java.security.SecureRandom secureRandom;
        byte[] bArr;
        byte[] bArr2;
        long j;
        kotlinx.coroutines.channels.Channel channel;
        int length;
        int i;
        long currentTimeMillis;
        int i2;
        int size;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.Channel<java.lang.String> seedChannel = io.ktor.util.NonceKt.getSeedChannel();
            arrayList = new java.util.ArrayList();
            lookupSecureRandom = io.ktor.util.NonceKt.lookupSecureRandom();
            secureRandom = java.security.SecureRandom.getInstance("SHA1PRNG");
            bArr = new byte[128];
            bArr2 = new byte[512];
            secureRandom.setSeed(lookupSecureRandom.generateSeed(128));
            j = 0;
            channel = seedChannel;
            lookupSecureRandom.nextBytes(bArr);
            secureRandom.nextBytes(bArr2);
            length = bArr.length;
            while (i < length) {
            }
            currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - j <= 30000) {
            }
            if (i2 >= size) {
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.I$1;
            i2 = this.I$0;
            long j2 = this.J$0;
            java.util.List list = (java.util.List) this.L$6;
            byte[] bArr3 = (byte[]) this.L$5;
            byte[] bArr4 = (byte[]) this.L$4;
            java.security.SecureRandom secureRandom2 = (java.security.SecureRandom) this.L$3;
            java.security.SecureRandom secureRandom3 = (java.security.SecureRandom) this.L$2;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.L$1;
            channel = (kotlinx.coroutines.channels.Channel) this.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List list2 = list;
                java.security.SecureRandom secureRandom4 = secureRandom2;
                byte[] bArr5 = bArr3;
                java.security.SecureRandom secureRandom5 = secureRandom3;
                java.util.ArrayList arrayList3 = arrayList2;
                long j3 = j2;
                i2++;
                if (i2 >= size) {
                    this.L$0 = channel;
                    this.L$1 = arrayList3;
                    this.L$2 = secureRandom5;
                    this.L$3 = secureRandom4;
                    this.L$4 = bArr4;
                    this.L$5 = bArr5;
                    this.L$6 = list2;
                    this.J$0 = j3;
                    this.I$0 = i2;
                    this.I$1 = size;
                    this.label = 1;
                    if (channel.send(list2.get(i2), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2++;
                    if (i2 >= size) {
                        arrayList3.clear();
                        int size2 = list2.size();
                        for (int size3 = list2.size() / 2; size3 < size2; size3++) {
                            arrayList3.add(list2.get(size3));
                        }
                        arrayList = arrayList3;
                        lookupSecureRandom = secureRandom5;
                        secureRandom = secureRandom4;
                        bArr = bArr4;
                        bArr2 = bArr5;
                        j = j3;
                        lookupSecureRandom.nextBytes(bArr);
                        secureRandom.nextBytes(bArr2);
                        length = bArr.length;
                        for (i = 0; i < length; i++) {
                            bArr2[i * 4] = bArr[i];
                        }
                        currentTimeMillis = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis - j <= 30000) {
                            secureRandom.setSeed(j - currentTimeMillis);
                            secureRandom.setSeed(lookupSecureRandom.generateSeed(bArr.length));
                            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.text.StringsKt.chunked(io.ktor.util.CryptoKt.hex(bArr2), 16), (java.lang.Iterable) arrayList);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(secureRandom);
                            java.util.List shuffled = kotlin.collections.CollectionsKt.shuffled(plus, secureRandom);
                            secureRandom4 = secureRandom;
                            secureRandom5 = lookupSecureRandom;
                            arrayList3 = arrayList;
                            i2 = 0;
                            byte[] bArr6 = bArr;
                            list2 = shuffled;
                            size = shuffled.size() / 2;
                            j3 = currentTimeMillis;
                            bArr5 = bArr2;
                            bArr4 = bArr6;
                        } else {
                            secureRandom.setSeed(bArr);
                            java.util.List plus2 = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.text.StringsKt.chunked(io.ktor.util.CryptoKt.hex(bArr2), 16), (java.lang.Iterable) arrayList);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(secureRandom);
                            java.util.List shuffled2 = kotlin.collections.CollectionsKt.shuffled(plus2, secureRandom);
                            secureRandom4 = secureRandom;
                            secureRandom5 = lookupSecureRandom;
                            arrayList3 = arrayList;
                            i2 = 0;
                            byte[] bArr7 = bArr;
                            list2 = shuffled2;
                            size = shuffled2.size() / 2;
                            j3 = j;
                            bArr5 = bArr2;
                            bArr4 = bArr7;
                        }
                        if (i2 >= size) {
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    channel.close(th);
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th2) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    throw th2;
                }
            }
        }
    }
}
