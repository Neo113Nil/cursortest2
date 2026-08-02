package io.sentry.rrweb;

import e1.k;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class RRWebInteractionEvent extends RRWebIncrementalSnapshotEvent implements JsonSerializable, JsonUnknown {
    private static final int POINTER_TYPE_TOUCH = 2;
    private Map<String, Object> dataUnknown;
    private int id;
    private InteractionType interactionType;
    private int pointerId;
    private int pointerType;
    private Map<String, Object> unknown;

    /* renamed from: x, reason: collision with root package name */
    private float f14517x;

    /* renamed from: y, reason: collision with root package name */
    private float f14518y;

    public static final class Deserializer implements JsonDeserializer<RRWebInteractionEvent> {
        private void deserializeData(RRWebInteractionEvent rRWebInteractionEvent, ObjectReader objectReader, ILogger iLogger) {
            String nextName;
            RRWebIncrementalSnapshotEvent.Deserializer deserializer = new RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            HashMap hashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                nextName = objectReader.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "x":
                        rRWebInteractionEvent.f14517x = objectReader.nextFloat();
                        break;
                    case "y":
                        rRWebInteractionEvent.f14518y = objectReader.nextFloat();
                        break;
                    case "id":
                        rRWebInteractionEvent.id = objectReader.nextInt();
                        break;
                    case "type":
                        rRWebInteractionEvent.interactionType = (InteractionType) objectReader.nextOrNull(iLogger, new InteractionType.Deserializer());
                        break;
                    case "pointerType":
                        rRWebInteractionEvent.pointerType = objectReader.nextInt();
                        break;
                    case "pointerId":
                        rRWebInteractionEvent.pointerId = objectReader.nextInt();
                        break;
                    default:
                        if (!deserializer.deserializeValue(rRWebInteractionEvent, nextName, objectReader, iLogger)) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            objectReader.nextUnknown(iLogger, hashMap, nextName);
                            break;
                        } else {
                            break;
                        }
                }
            }
            rRWebInteractionEvent.setDataUnknown(hashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebInteractionEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebInteractionEvent rRWebInteractionEvent = new RRWebInteractionEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap hashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.getClass();
                if (nextName.equals("data")) {
                    deserializeData(rRWebInteractionEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionEvent, nextName, objectReader, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, hashMap, nextName);
                }
            }
            rRWebInteractionEvent.setUnknown(hashMap);
            objectReader.endObject();
            return rRWebInteractionEvent;
        }
    }

    public enum InteractionType implements JsonSerializable {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class Deserializer implements JsonDeserializer<InteractionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public InteractionType deserialize(ObjectReader objectReader, ILogger iLogger) {
                return InteractionType.values()[objectReader.nextInt()];
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.value(ordinal());
        }
    }

    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String ID = "id";
        public static final String POINTER_ID = "pointerId";
        public static final String POINTER_TYPE = "pointerType";
        public static final String TYPE = "type";

        /* renamed from: X, reason: collision with root package name */
        public static final String f14519X = "x";

        /* renamed from: Y, reason: collision with root package name */
        public static final String f14520Y = "y";
    }

    public RRWebInteractionEvent() {
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction);
        this.pointerType = 2;
    }

    private void serializeData(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("type").value(iLogger, this.interactionType);
        objectWriter.name("id").value(this.id);
        objectWriter.name("x").value(this.f14517x);
        objectWriter.name("y").value(this.f14518y);
        objectWriter.name(JsonKeys.POINTER_TYPE).value(this.pointerType);
        objectWriter.name("pointerId").value(this.pointerId);
        Map<String, Object> map = this.dataUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                k.p(this.dataUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public int getId() {
        return this.id;
    }

    public InteractionType getInteractionType() {
        return this.interactionType;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    public int getPointerType() {
        return this.pointerType;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public float getX() {
        return this.f14517x;
    }

    public float getY() {
        return this.f14518y;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                k.p(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setId(int i7) {
        this.id = i7;
    }

    public void setInteractionType(InteractionType interactionType) {
        this.interactionType = interactionType;
    }

    public void setPointerId(int i7) {
        this.pointerId = i7;
    }

    public void setPointerType(int i7) {
        this.pointerType = i7;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setX(float f7) {
        this.f14517x = f7;
    }

    public void setY(float f7) {
        this.f14518y = f7;
    }
}
