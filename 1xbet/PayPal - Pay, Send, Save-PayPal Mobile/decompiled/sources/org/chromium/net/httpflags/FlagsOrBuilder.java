package org.chromium.net.httpflags;

/* loaded from: classes18.dex */
public interface FlagsOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    boolean containsFlags(java.lang.String str);

    @java.lang.Deprecated
    java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlags();

    int getFlagsCount();

    java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlagsMap();

    org.chromium.net.httpflags.FlagValue getFlagsOrDefault(java.lang.String str, org.chromium.net.httpflags.FlagValue flagValue);

    org.chromium.net.httpflags.FlagValue getFlagsOrThrow(java.lang.String str);
}
