package io.sentry.protocol;

import B1.c;
import G4.E;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.StringUtils;
import io.sentry.util.UUIDStringUtils;
import java.util.UUID;
import p056h4.i;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryId implements JsonSerializable {
    public static final SentryId EMPTY_ID = new SentryId(StringUtils.PROPER_NIL_UUID.replace("-", ""));
    private final LazyEvaluator<String> lazyStringValue;

    public static final class Deserializer implements JsonDeserializer<SentryId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryId deserialize(ObjectReader objectReader, ILogger iLogger) {
            return new SentryId(objectReader.nextString());
        }
    }

    public SentryId() {
        this((UUID) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$new$0(UUID uuid) {
        return lambda$new$1(UUIDStringUtils.toSentryIdString(uuid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$2(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: normalize, reason: merged with bridge method [inline-methods] */
    public String lambda$new$1(String str) {
        return StringUtils.normalizeUUID(str).replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SentryId.class != obj.getClass()) {
            return false;
        }
        return this.lazyStringValue.getValue().equals(((SentryId) obj).lazyStringValue.getValue());
    }

    public int hashCode() {
        return this.lazyStringValue.getValue().hashCode();
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(toString());
    }

    public String toString() {
        return this.lazyStringValue.getValue();
    }

    public SentryId(UUID uuid) {
        if (uuid != null) {
            this.lazyStringValue = new LazyEvaluator<>(new c(21, this, uuid));
        } else {
            this.lazyStringValue = new LazyEvaluator<>(new i(4));
        }
    }

    public SentryId(String str) {
        String strNormalizeUUID = StringUtils.normalizeUUID(str);
        if (strNormalizeUUID.length() != 32 && strNormalizeUUID.length() != 36) {
            throw new IllegalArgumentException(L.i("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ", str));
        }
        if (strNormalizeUUID.length() == 36) {
            this.lazyStringValue = new LazyEvaluator<>(new c(22, this, strNormalizeUUID));
        } else {
            this.lazyStringValue = new LazyEvaluator<>(new E(strNormalizeUUID));
        }
    }
}
