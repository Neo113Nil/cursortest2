package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ViewHierarchyNode implements JsonUnknown, JsonSerializable {
    private Double alpha;
    private List<ViewHierarchyNode> children;
    private Double height;
    private String identifier;
    private String renderingSystem;
    private String tag;
    private String type;
    private Map<String, Object> unknown;
    private String visibility;
    private Double width;

    /* renamed from: x, reason: collision with root package name */
    private Double f14505x;

    /* renamed from: y, reason: collision with root package name */
    private Double f14506y;

    public static final class Deserializer implements JsonDeserializer<ViewHierarchyNode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public ViewHierarchyNode deserialize(ObjectReader objectReader, ILogger iLogger) {
            String nextName;
            ViewHierarchyNode viewHierarchyNode = new ViewHierarchyNode();
            objectReader.beginObject();
            HashMap hashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                nextName = objectReader.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "rendering_system":
                        viewHierarchyNode.renderingSystem = objectReader.nextStringOrNull();
                        break;
                    case "identifier":
                        viewHierarchyNode.identifier = objectReader.nextStringOrNull();
                        break;
                    case "height":
                        viewHierarchyNode.height = objectReader.nextDoubleOrNull();
                        break;
                    case "x":
                        viewHierarchyNode.f14505x = objectReader.nextDoubleOrNull();
                        break;
                    case "y":
                        viewHierarchyNode.f14506y = objectReader.nextDoubleOrNull();
                        break;
                    case "tag":
                        viewHierarchyNode.tag = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        viewHierarchyNode.type = objectReader.nextStringOrNull();
                        break;
                    case "alpha":
                        viewHierarchyNode.alpha = objectReader.nextDoubleOrNull();
                        break;
                    case "width":
                        viewHierarchyNode.width = objectReader.nextDoubleOrNull();
                        break;
                    case "children":
                        viewHierarchyNode.children = objectReader.nextListOrNull(iLogger, this);
                        break;
                    case "visibility":
                        viewHierarchyNode.visibility = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, hashMap, nextName);
                        break;
                }
            }
            objectReader.endObject();
            viewHierarchyNode.setUnknown(hashMap);
            return viewHierarchyNode;
        }
    }

    public static final class JsonKeys {
        public static final String ALPHA = "alpha";
        public static final String CHILDREN = "children";
        public static final String HEIGHT = "height";
        public static final String IDENTIFIER = "identifier";
        public static final String RENDERING_SYSTEM = "rendering_system";
        public static final String TAG = "tag";
        public static final String TYPE = "type";
        public static final String VISIBILITY = "visibility";
        public static final String WIDTH = "width";

        /* renamed from: X, reason: collision with root package name */
        public static final String f14507X = "x";

        /* renamed from: Y, reason: collision with root package name */
        public static final String f14508Y = "y";
    }

    public Double getAlpha() {
        return this.alpha;
    }

    public List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public Double getHeight() {
        return this.height;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getRenderingSystem() {
        return this.renderingSystem;
    }

    public String getTag() {
        return this.tag;
    }

    public String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public Double getWidth() {
        return this.width;
    }

    public Double getX() {
        return this.f14505x;
    }

    public Double getY() {
        return this.f14506y;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.renderingSystem != null) {
            objectWriter.name("rendering_system").value(this.renderingSystem);
        }
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.identifier != null) {
            objectWriter.name(JsonKeys.IDENTIFIER).value(this.identifier);
        }
        if (this.tag != null) {
            objectWriter.name("tag").value(this.tag);
        }
        if (this.width != null) {
            objectWriter.name("width").value(this.width);
        }
        if (this.height != null) {
            objectWriter.name("height").value(this.height);
        }
        if (this.f14505x != null) {
            objectWriter.name("x").value(this.f14505x);
        }
        if (this.f14506y != null) {
            objectWriter.name("y").value(this.f14506y);
        }
        if (this.visibility != null) {
            objectWriter.name(JsonKeys.VISIBILITY).value(this.visibility);
        }
        if (this.alpha != null) {
            objectWriter.name(JsonKeys.ALPHA).value(this.alpha);
        }
        List<ViewHierarchyNode> list = this.children;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.CHILDREN).value(iLogger, this.children);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAlpha(Double d7) {
        this.alpha = d7;
    }

    public void setChildren(List<ViewHierarchyNode> list) {
        this.children = list;
    }

    public void setHeight(Double d7) {
        this.height = d7;
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public void setRenderingSystem(String str) {
        this.renderingSystem = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVisibility(String str) {
        this.visibility = str;
    }

    public void setWidth(Double d7) {
        this.width = d7;
    }

    public void setX(Double d7) {
        this.f14505x = d7;
    }

    public void setY(Double d7) {
        this.f14506y = d7;
    }
}
