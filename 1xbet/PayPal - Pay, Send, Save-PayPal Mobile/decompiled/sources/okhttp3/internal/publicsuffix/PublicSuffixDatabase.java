package okhttp3.internal.publicsuffix;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "publicSuffixList", "<init>", "(Lokhttp3/internal/publicsuffix/PublicSuffixList;)V", "", "domain", "getEffectiveTldPlusOne", "(Ljava/lang/String;)Ljava/lang/String;", "p0", "", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/util/List;", "getHighSpeedVideoSizes", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okhttp3.internal.publicsuffix.PublicSuffixList getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion INSTANCE = new okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion(null);
    private static final okio.ByteString getHighResolutionOutputSizeshNQ4ISI = okio.ByteString.INSTANCE.of(42);
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf("*");
    private static okhttp3.internal.publicsuffix.PublicSuffixDatabase Camera2StreamConfigurationMap = new okhttp3.internal.publicsuffix.PublicSuffixDatabase(okhttp3.internal.publicsuffix.PublicSuffixList_androidKt.getDefault(okhttp3.internal.publicsuffix.PublicSuffixList.INSTANCE));

    public PublicSuffixDatabase(okhttp3.internal.publicsuffix.PublicSuffixList publicSuffixList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicSuffixList, "");
        this.getHighSpeedVideoFpsRanges = publicSuffixList;
    }

    public final java.lang.String getEffectiveTldPlusOne(java.lang.String domain) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List<java.lang.String> emptyList;
        java.util.List<java.lang.String> emptyList2;
        int size;
        int size2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
        java.lang.String unicode = java.net.IDN.toUnicode(domain);
        kotlin.jvm.internal.Intrinsics.checkNotNull(unicode);
        java.util.List<java.lang.String> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(unicode);
        this.getHighSpeedVideoFpsRanges.ensureLoaded();
        int size3 = Camera2StreamConfigurationMap2.size();
        okio.ByteString[] byteStringArr = new okio.ByteString[size3];
        for (int i = 0; i < size3; i++) {
            byteStringArr[i] = okio.ByteString.INSTANCE.encodeUtf8(Camera2StreamConfigurationMap2.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                str = null;
                break;
            }
            str = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(INSTANCE, this.getHighSpeedVideoFpsRanges.getBytes(), byteStringArr, i2);
            if (str != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            okio.ByteString[] byteStringArr2 = (okio.ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length;
            for (int i3 = 0; i3 < length - 1; i3++) {
                byteStringArr2[i3] = getHighResolutionOutputSizeshNQ4ISI;
                str2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(INSTANCE, this.getHighSpeedVideoFpsRanges.getBytes(), byteStringArr2, i3);
                if (str2 != null) {
                    break;
                }
            }
        }
        str2 = null;
        if (str2 != null) {
            for (int i4 = 0; i4 < size3 - 1; i4++) {
                str3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(INSTANCE, this.getHighSpeedVideoFpsRanges.getExceptionBytes(), byteStringArr, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            emptyList2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) "!".concat(java.lang.String.valueOf(str3)), new char[]{com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR}, false, 0, 6, (java.lang.Object) null);
        } else if (str == null && str2 == null) {
            emptyList2 = getHighSpeedVideoFpsRangesFor;
        } else {
            if (str == null || (emptyList = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new char[]{com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR}, false, 0, 6, (java.lang.Object) null)) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            if (str2 == null || (emptyList2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str2, new char[]{com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR}, false, 0, 6, (java.lang.Object) null)) == null) {
                emptyList2 = kotlin.collections.CollectionsKt.emptyList();
            }
            if (emptyList.size() > emptyList2.size()) {
                emptyList2 = emptyList;
            }
        }
        if (Camera2StreamConfigurationMap2.size() == emptyList2.size() && emptyList2.get(0).charAt(0) != '!') {
            return null;
        }
        if (emptyList2.get(0).charAt(0) == '!') {
            size = Camera2StreamConfigurationMap2.size();
            size2 = emptyList2.size();
        } else {
            size = Camera2StreamConfigurationMap2.size();
            size2 = emptyList2.size() + 1;
        }
        return kotlin.sequences.SequencesKt.joinToString$default(kotlin.sequences.SequencesKt.drop(kotlin.collections.CollectionsKt.asSequence(Camera2StreamConfigurationMap(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    private static java.util.List<java.lang.String> Camera2StreamConfigurationMap(java.lang.String p0) {
        java.util.List<java.lang.String> split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) p0, new char[]{com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR}, false, 0, 6, (java.lang.Object) null);
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.last((java.util.List) split$default), "") ? kotlin.collections.CollectionsKt.dropLast(split$default, 1) : split$default;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "resetForTests$okhttp", "Lokio/ByteString;", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/ByteString;", "", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.publicsuffix.PublicSuffixDatabase get() {
            return okhttp3.internal.publicsuffix.PublicSuffixDatabase.Camera2StreamConfigurationMap;
        }

        public final void resetForTests$okhttp() {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.Camera2StreamConfigurationMap = new okhttp3.internal.publicsuffix.PublicSuffixDatabase(okhttp3.internal.publicsuffix.PublicSuffixList_androidKt.getDefault(okhttp3.internal.publicsuffix.PublicSuffixList.INSTANCE));
        }

        public static final /* synthetic */ java.lang.String access$binarySearch(okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion companion, okio.ByteString byteString, okio.ByteString[] byteStringArr, int i) {
            int i2;
            boolean z;
            int and;
            int and2;
            int size = byteString.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = (i3 + size) / 2;
                while (i4 >= 0 && byteString.getByte(i4) != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (byteString.getByte(i2) == 10) {
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
                        and = okhttp3.internal._UtilCommonKt.and(byteStringArr[i8].getByte(i9), 255);
                    }
                    and2 = and - okhttp3.internal._UtilCommonKt.and(byteString.getByte(i5 + i10), 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (byteStringArr[i8].size() != i9) {
                        z2 = z;
                    } else {
                        if (i8 == byteStringArr.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int size2 = byteStringArr[i8].size() - i9;
                        int length = byteStringArr.length;
                        for (int i12 = i8 + 1; i12 < length; i12++) {
                            size2 += byteStringArr[i12].size();
                        }
                        if (size2 >= i11) {
                            if (size2 <= i11) {
                                return byteString.substring(i5, i7 + i5).string(kotlin.text.Charsets.UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                size = i4;
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
