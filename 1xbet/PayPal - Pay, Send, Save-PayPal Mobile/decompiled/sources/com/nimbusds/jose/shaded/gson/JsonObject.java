package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public final class JsonObject extends com.nimbusds.jose.shaded.gson.JsonElement {
    private final com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap<java.lang.String, com.nimbusds.jose.shaded.gson.JsonElement> members = new com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap<>(false);

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final com.nimbusds.jose.shaded.gson.JsonObject deepCopy() {
        com.nimbusds.jose.shaded.gson.JsonObject jsonObject = new com.nimbusds.jose.shaded.gson.JsonObject();
        for (java.util.Map.Entry<java.lang.String, com.nimbusds.jose.shaded.gson.JsonElement> entry : this.members.entrySet()) {
            jsonObject.add(entry.getKey(), entry.getValue().deepCopy());
        }
        return jsonObject;
    }

    public final void add(java.lang.String str, com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
        com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap<java.lang.String, com.nimbusds.jose.shaded.gson.JsonElement> linkedTreeMap = this.members;
        if (jsonElement == null) {
            jsonElement = com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE;
        }
        linkedTreeMap.put(str, jsonElement);
    }

    public final com.nimbusds.jose.shaded.gson.JsonElement remove(java.lang.String str) {
        return this.members.remove(str);
    }

    public final void addProperty(java.lang.String str, java.lang.String str2) {
        add(str, str2 == null ? com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE : new com.nimbusds.jose.shaded.gson.JsonPrimitive(str2));
    }

    public final void addProperty(java.lang.String str, java.lang.Number number) {
        add(str, number == null ? com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE : new com.nimbusds.jose.shaded.gson.JsonPrimitive(number));
    }

    public final void addProperty(java.lang.String str, java.lang.Boolean bool) {
        add(str, bool == null ? com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE : new com.nimbusds.jose.shaded.gson.JsonPrimitive(bool));
    }

    public final void addProperty(java.lang.String str, java.lang.Character ch) {
        add(str, ch == null ? com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE : new com.nimbusds.jose.shaded.gson.JsonPrimitive(ch));
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.String, com.nimbusds.jose.shaded.gson.JsonElement>> entrySet() {
        return this.members.entrySet();
    }

    public final java.util.Set<java.lang.String> keySet() {
        return this.members.keySet();
    }

    public final int size() {
        return this.members.size();
    }

    public final boolean isEmpty() {
        return this.members.size() == 0;
    }

    public final boolean has(java.lang.String str) {
        return this.members.containsKey(str);
    }

    public final com.nimbusds.jose.shaded.gson.JsonElement get(java.lang.String str) {
        return this.members.get(str);
    }

    public final com.nimbusds.jose.shaded.gson.JsonPrimitive getAsJsonPrimitive(java.lang.String str) {
        return (com.nimbusds.jose.shaded.gson.JsonPrimitive) this.members.get(str);
    }

    public final com.nimbusds.jose.shaded.gson.JsonArray getAsJsonArray(java.lang.String str) {
        return (com.nimbusds.jose.shaded.gson.JsonArray) this.members.get(str);
    }

    public final com.nimbusds.jose.shaded.gson.JsonObject getAsJsonObject(java.lang.String str) {
        return (com.nimbusds.jose.shaded.gson.JsonObject) this.members.get(str);
    }

    public final java.util.Map<java.lang.String, com.nimbusds.jose.shaded.gson.JsonElement> asMap() {
        return this.members;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.nimbusds.jose.shaded.gson.JsonObject) && ((com.nimbusds.jose.shaded.gson.JsonObject) obj).members.equals(this.members);
        }
        return true;
    }

    public final int hashCode() {
        return this.members.hashCode();
    }
}
