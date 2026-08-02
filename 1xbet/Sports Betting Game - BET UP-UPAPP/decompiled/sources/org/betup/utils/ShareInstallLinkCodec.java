package org.betup.utils;

import android.util.Base64;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShareInstallLinkCodec.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\tH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/utils/ShareInstallLinkCodec;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "VERSION", "", "TYPE_MATCH", "TYPE_BET", "PAYLOAD_LEN", "", "b64Flags", "encodeMatch", "", "matchId", "decode", "Lorg/betup/utils/ShareInstallLinkCodec$Decoded;", "token", "Decoded", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShareInstallLinkCodec {
    public static final int $stable = 0;
    private static final int PAYLOAD_LEN = 10;
    private static final byte TYPE_BET = 1;
    private static final byte TYPE_MATCH = 0;
    private static final byte VERSION = 1;
    public static final ShareInstallLinkCodec INSTANCE = new ShareInstallLinkCodec();
    private static final int b64Flags = 11;

    private ShareInstallLinkCodec() {
    }

    /* compiled from: ShareInstallLinkCodec.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/utils/ShareInstallLinkCodec$Decoded;", "", "isBet", "", "entityId", "", "ownerUserId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZII)V", "()Z", "getEntityId", "()I", "getOwnerUserId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Decoded {
        public static final int $stable = 0;
        private final int entityId;
        private final boolean isBet;
        private final int ownerUserId;

        public static /* synthetic */ Decoded copy$default(Decoded decoded, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = decoded.isBet;
            }
            if ((i3 & 2) != 0) {
                i = decoded.entityId;
            }
            if ((i3 & 4) != 0) {
                i2 = decoded.ownerUserId;
            }
            return decoded.copy(z, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsBet() {
            return this.isBet;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEntityId() {
            return this.entityId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getOwnerUserId() {
            return this.ownerUserId;
        }

        public final Decoded copy(boolean isBet, int entityId, int ownerUserId) {
            return new Decoded(isBet, entityId, ownerUserId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Decoded)) {
                return false;
            }
            Decoded decoded = (Decoded) other;
            return this.isBet == decoded.isBet && this.entityId == decoded.entityId && this.ownerUserId == decoded.ownerUserId;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isBet) * 31) + Integer.hashCode(this.entityId)) * 31) + Integer.hashCode(this.ownerUserId);
        }

        public String toString() {
            return "Decoded(isBet=" + this.isBet + ", entityId=" + this.entityId + ", ownerUserId=" + this.ownerUserId + ")";
        }

        public Decoded(boolean z, int i, int i2) {
            this.isBet = z;
            this.entityId = i;
            this.ownerUserId = i2;
        }

        public final boolean isBet() {
            return this.isBet;
        }

        public final int getEntityId() {
            return this.entityId;
        }

        public final int getOwnerUserId() {
            return this.ownerUserId;
        }
    }

    @JvmStatic
    public static final String encodeMatch(int matchId) {
        if (matchId <= 0) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(10);
        allocate.put((byte) 1);
        allocate.put((byte) 0);
        allocate.putInt(matchId);
        allocate.putInt(0);
        return Base64.encodeToString(allocate.array(), b64Flags);
    }

    @JvmStatic
    public static final Decoded decode(String token) {
        String str = token;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(StringsKt.trim((CharSequence) token).toString(), b64Flags);
            if (decode.length != 10) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(decode);
            if (wrap.get() != 1) {
                return null;
            }
            byte b = wrap.get();
            int i = wrap.getInt();
            int i2 = wrap.getInt();
            if (i <= 0 || i2 < 0) {
                return null;
            }
            if (b == 0) {
                return new Decoded(false, i, 0);
            }
            if (b == 1) {
                return new Decoded(true, i, i2);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
