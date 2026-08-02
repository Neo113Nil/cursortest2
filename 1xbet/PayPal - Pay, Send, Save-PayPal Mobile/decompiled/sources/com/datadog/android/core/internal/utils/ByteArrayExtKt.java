package com.datadog.android.core.internal.utils;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0018\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00142\u0006\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010!\u001a\u00020 *\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020#*\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%"}, d2 = {"", "", "fromIndex", "toIndex", "copyOfRangeSafe", "([BII)[B", "srcPos", "dest", "destPos", "length", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "copyTo", "([BI[BIILcom/datadog/android/api/InternalLogger;)Z", "", util.h.xy.cb.b.f1091, "startIndex", "indexOf", "([BBI)I", "", "separator", "prefix", "suffix", "join", "(Ljava/util/Collection;[B[B[BLcom/datadog/android/api/InternalLogger;)[B", "delimiter", "", "split", "([BBLcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "toInt", "([B)I", "", "toLong", "([B)J", "", "toShort", "([B)S"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteArrayExtKt {
    public static final java.util.List<byte[]> split(byte[] bArr, byte b, com.datadog.android.api.InternalLogger internalLogger) {
        int indexOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        do {
            indexOf = indexOf(bArr, b, i);
            int length = indexOf >= 0 ? indexOf - i : bArr.length - i;
            if (length > 0) {
                byte[] bArr2 = new byte[length];
                copyTo(bArr, i, bArr2, 0, length, internalLogger);
                arrayList.add(bArr2);
            }
            i = indexOf + 1;
        } while (indexOf != -1);
        return arrayList;
    }

    public static /* synthetic */ byte[] join$default(java.util.Collection collection, byte[] bArr, byte[] bArr2, byte[] bArr3, com.datadog.android.api.InternalLogger internalLogger, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bArr2 = new byte[0];
        }
        if ((i & 4) != 0) {
            bArr3 = new byte[0];
        }
        return join(collection, bArr, bArr2, bArr3, internalLogger);
    }

    public static final byte[] join(java.util.Collection<byte[]> collection, byte[] bArr, byte[] bArr2, byte[] bArr3, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.util.Collection<byte[]> collection2 = collection;
        java.util.Iterator<T> it = collection2.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((byte[]) it.next()).length;
        }
        byte[] bArr4 = new byte[bArr2.length + i + (collection.isEmpty() ? 0 : (collection.size() - 1) * bArr.length) + bArr3.length];
        copyTo(bArr2, 0, bArr4, 0, bArr2.length, internalLogger);
        int length = bArr2.length;
        for (kotlin.collections.IndexedValue indexedValue : kotlin.collections.CollectionsKt.withIndex(collection2)) {
            copyTo((byte[]) indexedValue.getValue(), 0, bArr4, length, ((byte[]) indexedValue.getValue()).length, internalLogger);
            length += ((byte[]) indexedValue.getValue()).length;
            if (indexedValue.getIndex() != collection.size() - 1) {
                copyTo(bArr, 0, bArr4, length, bArr.length, internalLogger);
                length += bArr.length;
            }
        }
        copyTo(bArr3, 0, bArr4, length, bArr3.length, internalLogger);
        return bArr4;
    }

    public static /* synthetic */ int indexOf$default(byte[] bArr, byte b, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOf(bArr, b, i);
    }

    public static final int indexOf(byte[] bArr, byte b, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (i < 0) {
            return -1;
        }
        int length = bArr.length;
        while (i < length) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final boolean copyTo(byte[] bArr, int i, byte[] bArr2, int i2, int i3, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        if (i2 + i3 > bArr2.length) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Cannot copy ByteArray, dest doesn't have enough space";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        if (i + i3 > bArr.length) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Cannot copy ByteArray, src doesn't have enough data";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        java.lang.System.arraycopy(bArr, i, bArr2, i2, i3);
        return true;
    }

    public static final long toLong(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return java.nio.ByteBuffer.wrap(bArr).getLong();
    }

    public static final int toInt(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return java.nio.ByteBuffer.wrap(bArr).getInt();
    }

    public static final short toShort(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return java.nio.ByteBuffer.wrap(bArr).getShort();
    }

    public static final byte[] copyOfRangeSafe(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        try {
            return kotlin.collections.ArraysKt.copyOfRange(bArr, i, i2);
        } catch (java.lang.IllegalArgumentException unused) {
            return new byte[0];
        } catch (java.lang.IndexOutOfBoundsException unused2) {
            return new byte[0];
        }
    }
}
