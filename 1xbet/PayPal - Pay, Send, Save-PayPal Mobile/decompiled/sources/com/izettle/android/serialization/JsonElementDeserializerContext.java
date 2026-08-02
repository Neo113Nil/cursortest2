package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0004\u001f !\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0006*\u00020\u00110\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, d2 = {"Lcom/izettle/android/serialization/JsonElementDeserializerContext;", "Lcom/izettle/android/serialization/JsonParser$Callbacks;", "<init>", "()V", "", "beginArray", "beginObject", "endArray", "endObject", "", "key", "keyParsed", "(Ljava/lang/String;)V", "Lcom/izettle/android/serialization/JsonElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "valueParsed", "(Lcom/izettle/android/serialization/JsonElement;)V", "Lcom/izettle/android/serialization/JsonElementDeserializerContext$State;", "getCurrentState", "()Lcom/izettle/android/serialization/JsonElementDeserializerContext$State;", "currentState", "p0", "deserializedObject", "Lcom/izettle/android/serialization/JsonElement;", "getDeserializedObject", "()Lcom/izettle/android/serialization/JsonElement;", "Ljava/util/Stack;", "elements", "Ljava/util/Stack;", "parsedKeys", "states", "InArray", "InObject", "Initial", "State"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonElementDeserializerContext implements com.izettle.android.serialization.JsonParser.Callbacks {
    private com.izettle.android.serialization.JsonElement deserializedObject;
    private final java.util.Stack<com.izettle.android.serialization.JsonElementDeserializerContext.State> states;
    private final java.util.Stack<java.lang.String> parsedKeys = new java.util.Stack<>();
    private final java.util.Stack<com.izettle.android.serialization.JsonElement> elements = new java.util.Stack<>();

    public JsonElementDeserializerContext() {
        java.util.Stack<com.izettle.android.serialization.JsonElementDeserializerContext.State> stack = new java.util.Stack<>();
        stack.push(com.izettle.android.serialization.JsonElementDeserializerContext.Initial.INSTANCE);
        this.states = stack;
    }

    private final com.izettle.android.serialization.JsonElementDeserializerContext.State getCurrentState() {
        return this.states.peek();
    }

    public final com.izettle.android.serialization.JsonElement getDeserializedObject() {
        return this.deserializedObject;
    }

    @Override // com.izettle.android.serialization.JsonParser.Callbacks
    public final void keyParsed(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.parsedKeys.push(key);
    }

    @Override // com.izettle.android.serialization.JsonParser.Callbacks
    public final void valueParsed(com.izettle.android.serialization.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        getCurrentState().valueParsed(this, value);
    }

    @Override // com.izettle.android.serialization.JsonParser.Callbacks
    public final void beginObject() {
        getCurrentState().beginObject(this);
    }

    @Override // com.izettle.android.serialization.JsonParser.Callbacks
    public final void endObject() {
        this.states.pop();
        com.izettle.android.serialization.JsonElement pop = this.elements.pop();
        if (this.elements.isEmpty()) {
            this.deserializedObject = pop;
        }
    }

    @Override // com.izettle.android.serialization.JsonParser.Callbacks
    public final void beginArray() {
        getCurrentState().beginArray(this);
    }

    @Override // com.izettle.android.serialization.JsonParser.Callbacks
    public final void endArray() {
        this.states.pop();
        com.izettle.android.serialization.JsonElement pop = this.elements.pop();
        if (this.elements.isEmpty()) {
            this.deserializedObject = pop;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/izettle/android/serialization/JsonElementDeserializerContext$Initial;", "Lcom/izettle/android/serialization/JsonElementDeserializerContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonElementDeserializerContext;", "context", "", "beginArray", "(Lcom/izettle/android/serialization/JsonElementDeserializerContext;)V", "beginObject", "Lcom/izettle/android/serialization/JsonElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "valueParsed", "(Lcom/izettle/android/serialization/JsonElementDeserializerContext;Lcom/izettle/android/serialization/JsonElement;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Initial implements com.izettle.android.serialization.JsonElementDeserializerContext.State {
        public static final com.izettle.android.serialization.JsonElementDeserializerContext.Initial INSTANCE = new com.izettle.android.serialization.JsonElementDeserializerContext.Initial();

        private Initial() {
        }

        @Override // com.izettle.android.serialization.JsonElementDeserializerContext.State
        public final void valueParsed(com.izettle.android.serialization.JsonElementDeserializerContext context, com.izettle.android.serialization.JsonElement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            context.elements.push(value);
        }

        @Override // com.izettle.android.serialization.JsonElementDeserializerContext.State
        public final void beginObject(com.izettle.android.serialization.JsonElementDeserializerContext context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            context.elements.push(new com.izettle.android.serialization.JsonObject());
            context.states.push(com.izettle.android.serialization.JsonElementDeserializerContext.InObject.INSTANCE);
        }

        @Override // com.izettle.android.serialization.JsonElementDeserializerContext.State
        public final void beginArray(com.izettle.android.serialization.JsonElementDeserializerContext context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            context.elements.push(new com.izettle.android.serialization.JsonArray());
            context.states.push(com.izettle.android.serialization.JsonElementDeserializerContext.InArray.INSTANCE);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/izettle/android/serialization/JsonElementDeserializerContext$InObject;", "Lcom/izettle/android/serialization/JsonElementDeserializerContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonElementDeserializerContext;", "context", "", "beginArray", "(Lcom/izettle/android/serialization/JsonElementDeserializerContext;)V", "beginObject", "Lcom/izettle/android/serialization/JsonElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "valueParsed", "(Lcom/izettle/android/serialization/JsonElementDeserializerContext;Lcom/izettle/android/serialization/JsonElement;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InObject implements com.izettle.android.serialization.JsonElementDeserializerContext.State {
        public static final com.izettle.android.serialization.JsonElementDeserializerContext.InObject INSTANCE = new com.izettle.android.serialization.JsonElementDeserializerContext.InObject();

        private InObject() {
        }

        @Override // com.izettle.android.serialization.JsonElementDeserializerContext.State
        public final void valueParsed(com.izettle.android.serialization.JsonElementDeserializerContext context, com.izettle.android.serialization.JsonElement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.lang.String str = (java.lang.String) context.parsedKeys.pop();
            com.izettle.android.serialization.JsonObject asJsonObject = ((com.izettle.android.serialization.JsonElement) context.elements.peek()).asJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            asJsonObject.set(str, value);
        }

        @Override // com.izettle.android.serialization.JsonElementDeserializerContext.State
        public final void beginObject(com.izettle.android.serialization.JsonElementDeserializerContext context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            java.lang.String str = (java.lang.String) context.parsedKeys.pop();
            com.izettle.android.serialization.JsonObject jsonObject = new com.izettle.android.serialization.JsonObject();
            com.izettle.android.serialization.JsonObject asJsonObject = ((com.izettle.android.serialization.JsonElement) context.elements.peek()).asJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            asJsonObject.set(str, jsonObject);
            context.elements.push(jsonObject);
            context.states.push(INSTANCE);
        }

        @Override // com.izettle.android.serialization.JsonElementDeserializerContext.State
        public final void beginArray(com.izettle.android.serialization.JsonElementDeserializerContext context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            java.lang.String str = (java.lang.String) context.parsedKeys.pop();
            com.izettle.android.serialization.JsonArray jsonArray = new com.izettle.android.serialization.JsonArray();
            com.izettle.android.serialization.JsonObject asJsonObject = ((com.izettle.android.serialization.JsonElement) context.elements.peek()).asJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            asJsonObject.set(str, jsonArray);
            context.elements.push(jsonArray);
            context.states.push(com.izettle.android.serialization.JsonElementDeserializerContext.InArray.INSTANCE);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/izettle/android/serialization/JsonElementDeserializerContext$InArray;", "Lcom/izettle/android/serialization/JsonElementDeserializerContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonElementDeserializerContext;", "context", "", "beginArray", "(Lcom/izettle/android/serialization/JsonElementDeserializerContext;)V", "beginObject", "Lcom/izettle/android/serialization/JsonElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "valueParsed", "(Lcom/izettle/android/serialization/JsonElementDeserializerContext;Lcom/izettle/android/serialization/JsonElement;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InArray implements com.izettle.android.serialization.JsonElementDeserializerContext.State {
        public static final com.izettle.android.serialization.JsonElementDeserializerContext.InArray INSTANCE = new com.izettle.android.serialization.JsonElementDeserializerContext.InArray();

        private InArray() {
        }

        @Override // com.izettle.android.serialization.JsonElementDeserializerContext.State
        public final void valueParsed(com.izettle.android.serialization.JsonElementDeserializerContext context, com.izettle.android.serialization.JsonElement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            ((com.izettle.android.serialization.JsonElement) context.elements.peek()).asJsonArray().push(value);
        }

        @Override // com.izettle.android.serialization.JsonElementDeserializerContext.State
        public final void beginObject(com.izettle.android.serialization.JsonElementDeserializerContext context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            com.izettle.android.serialization.JsonObject jsonObject = new com.izettle.android.serialization.JsonObject();
            ((com.izettle.android.serialization.JsonElement) context.elements.peek()).asJsonArray().push(jsonObject);
            context.elements.push(jsonObject);
            context.states.push(com.izettle.android.serialization.JsonElementDeserializerContext.InObject.INSTANCE);
        }

        @Override // com.izettle.android.serialization.JsonElementDeserializerContext.State
        public final void beginArray(com.izettle.android.serialization.JsonElementDeserializerContext context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            com.izettle.android.serialization.JsonArray jsonArray = new com.izettle.android.serialization.JsonArray();
            ((com.izettle.android.serialization.JsonElement) context.elements.peek()).asJsonArray().push(jsonArray);
            context.elements.push(jsonArray);
            context.states.push(INSTANCE);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/izettle/android/serialization/JsonElementDeserializerContext$State;", "", "Lcom/izettle/android/serialization/JsonElementDeserializerContext;", "context", "", "beginArray", "(Lcom/izettle/android/serialization/JsonElementDeserializerContext;)V", "beginObject", "Lcom/izettle/android/serialization/JsonElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "valueParsed", "(Lcom/izettle/android/serialization/JsonElementDeserializerContext;Lcom/izettle/android/serialization/JsonElement;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface State {
        void beginArray(com.izettle.android.serialization.JsonElementDeserializerContext context);

        void beginObject(com.izettle.android.serialization.JsonElementDeserializerContext context);

        void valueParsed(com.izettle.android.serialization.JsonElementDeserializerContext context, com.izettle.android.serialization.JsonElement value);

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void beginObject(com.izettle.android.serialization.JsonElementDeserializerContext.State state, com.izettle.android.serialization.JsonElementDeserializerContext jsonElementDeserializerContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElementDeserializerContext, "");
            }

            public static void beginArray(com.izettle.android.serialization.JsonElementDeserializerContext.State state, com.izettle.android.serialization.JsonElementDeserializerContext jsonElementDeserializerContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElementDeserializerContext, "");
            }
        }
    }
}
