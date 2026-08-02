package org.chromium.net.httpflags;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* loaded from: classes4.dex */
public interface FlagsOrBuilder extends MessageLiteOrBuilder {
    boolean containsFlags(String key);

    @Deprecated
    Map<String, FlagValue> getFlags();

    int getFlagsCount();

    Map<String, FlagValue> getFlagsMap();

    FlagValue getFlagsOrDefault(String key, FlagValue defaultValue);

    FlagValue getFlagsOrThrow(String key);
}
