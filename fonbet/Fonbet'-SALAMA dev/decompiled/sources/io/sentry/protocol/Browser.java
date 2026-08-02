package io.sentry.protocol;

import e1.k;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Browser implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "browser";
    private String name;
    private Map<String, Object> unknown;
    private String version;

    public static final class Deserializer implements JsonDeserializer<Browser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public Browser deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            Browser browser = new Browser();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.getClass();
                if (nextName.equals("name")) {
                    browser.name = objectReader.nextStringOrNull();
                } else if (nextName.equals("version")) {
                    browser.version = objectReader.nextStringOrNull();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                }
            }
            browser.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return browser;
        }
    }

    public static final class JsonKeys {
        public static final String NAME = "name";
        public static final String VERSION = "version";
    }

    public Browser() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Browser.class != obj.getClass()) {
            return false;
        }
        Browser browser = (Browser) obj;
        return Objects.equals(this.name, browser.name) && Objects.equals(this.version, browser.version);
    }

    public String getName() {
        return this.name;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.version);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.version != null) {
            objectWriter.name("version").value(this.version);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                k.p(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public Browser(Browser browser) {
        this.name = browser.name;
        this.version = browser.version;
        this.unknown = CollectionUtils.newConcurrentHashMap(browser.unknown);
    }
}
