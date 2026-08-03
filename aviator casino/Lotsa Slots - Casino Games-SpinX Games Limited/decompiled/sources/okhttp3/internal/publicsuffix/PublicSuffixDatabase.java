package okhttp3.internal.publicsuffix;

/* compiled from: PublicSuffixDatabase.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "()V", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", "", "publicSuffixListBytes", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "findMatchingRule", "", "", "domainLabels", "getEffectiveTldPlusOne", com.ironsource.X3.j.D, "readTheList", "", "readTheListUninterruptibly", "setListBytes", "splitDomain", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final java.lang.String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion INSTANCE = new okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final java.util.List<java.lang.String> PREVAILING_RULE = kotlin.collections.CollectionsKt.listOf("*");
    private static final okhttp3.internal.publicsuffix.PublicSuffixDatabase instance = new okhttp3.internal.publicsuffix.PublicSuffixDatabase();
    private final java.util.concurrent.atomic.AtomicBoolean listRead = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.CountDownLatch readCompleteLatch = new java.util.concurrent.CountDownLatch(1);

    public final java.lang.String getEffectiveTldPlusOne(java.lang.String domain) {
        int size;
        int size2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
        java.lang.String unicodeDomain = java.net.IDN.toUnicode(domain);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        java.util.List<java.lang.String> splitDomain = splitDomain(unicodeDomain);
        java.util.List<java.lang.String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        return kotlin.sequences.SequencesKt.joinToString$default(kotlin.sequences.SequencesKt.drop(kotlin.collections.CollectionsKt.asSequence(splitDomain(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    private final java.util.List<java.lang.String> splitDomain(java.lang.String domain) {
        java.util.List<java.lang.String> split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) domain, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.last((java.util.List) split$default), "") ? kotlin.collections.CollectionsKt.dropLast(split$default, 1) : split$default;
    }

    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> domainLabels) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List<java.lang.String> emptyList;
        java.util.List<java.lang.String> emptyList2;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        if (this.publicSuffixListBytes == null) {
            throw new java.lang.IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            java.lang.String str4 = domainLabels.get(i);
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        byte[][] bArr2 = bArr;
        int length = bArr2.length;
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= length) {
                str2 = null;
                break;
            }
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion companion = INSTANCE;
            byte[] bArr3 = this.publicSuffixListBytes;
            if (bArr3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr3 = null;
            }
            str2 = companion.binarySearch(bArr3, bArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
        if (bArr2.length > 1) {
            byte[][] bArr4 = (byte[][]) bArr2.clone();
            int length2 = bArr4.length - 1;
            for (int i3 = 0; i3 < length2; i3++) {
                bArr4[i3] = WILDCARD_LABEL;
                okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion companion2 = INSTANCE;
                byte[] bArr5 = this.publicSuffixListBytes;
                if (bArr5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                    bArr5 = null;
                }
                str3 = companion2.binarySearch(bArr5, bArr4, i3);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int length3 = bArr2.length - 1;
            int i4 = 0;
            while (true) {
                if (i4 >= length3) {
                    break;
                }
                okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion companion3 = INSTANCE;
                byte[] bArr6 = this.publicSuffixExceptionListBytes;
                if (bArr6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr6 = null;
                }
                java.lang.String binarySearch = companion3.binarySearch(bArr6, bArr, i4);
                if (binarySearch != null) {
                    str = binarySearch;
                    break;
                }
                i4++;
            }
        }
        if (str != null) {
            return kotlin.text.StringsKt.split$default((java.lang.CharSequence) ("!" + str), new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        if (str2 == null || (emptyList = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str2, new char[]{'.'}, false, 0, 6, (java.lang.Object) null)) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        if (str3 == null || (emptyList2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new char[]{'.'}, false, 0, 6, (java.lang.Object) null)) == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return emptyList.size() > emptyList2.size() ? emptyList : emptyList2;
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (java.io.InterruptedIOException unused) {
                    java.lang.Thread.interrupted();
                    z = true;
                } catch (java.io.IOException e) {
                    okhttp3.internal.platform.Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e);
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, byte[]] */
    private final void readTheList() throws java.io.IOException {
        try {
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            java.io.InputStream resourceAsStream = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream == null) {
                return;
            }
            okio.BufferedSource buffer = okio.Okio.buffer(new okio.GzipSource(okio.Okio.source(resourceAsStream)));
            try {
                okio.BufferedSource bufferedSource = buffer;
                objectRef.element = bufferedSource.readByteArray(bufferedSource.readInt());
                objectRef2.element = bufferedSource.readByteArray(bufferedSource.readInt());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(buffer, null);
                synchronized (this) {
                    T t = objectRef.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                    this.publicSuffixListBytes = (byte[]) t;
                    T t2 = objectRef2.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                    this.publicSuffixExceptionListBytes = (byte[]) t2;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicSuffixListBytes, "publicSuffixListBytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    /* compiled from: PublicSuffixDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", com.ironsource.C3232q2.p, "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.publicsuffix.PublicSuffixDatabase get() {
            return okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int and;
            int and2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        z = z2;
                        and = okhttp3.internal.Util.and(bArr2[i8][i9], 255);
                    }
                    and2 = and - okhttp3.internal.Util.and(bArr[i5 + i10], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new java.lang.String(bArr, i5, i7, UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }
    }
}
