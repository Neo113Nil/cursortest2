package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public final class JsonArray extends com.nimbusds.jose.shaded.gson.JsonElement implements java.lang.Iterable<com.nimbusds.jose.shaded.gson.JsonElement> {
    private final java.util.ArrayList<com.nimbusds.jose.shaded.gson.JsonElement> elements;

    public JsonArray() {
        this.elements = new java.util.ArrayList<>();
    }

    public JsonArray(int i) {
        this.elements = new java.util.ArrayList<>(i);
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final com.nimbusds.jose.shaded.gson.JsonArray deepCopy() {
        if (!this.elements.isEmpty()) {
            com.nimbusds.jose.shaded.gson.JsonArray jsonArray = new com.nimbusds.jose.shaded.gson.JsonArray(this.elements.size());
            java.util.Iterator<com.nimbusds.jose.shaded.gson.JsonElement> it = this.elements.iterator();
            while (it.hasNext()) {
                jsonArray.add(it.next().deepCopy());
            }
            return jsonArray;
        }
        return new com.nimbusds.jose.shaded.gson.JsonArray();
    }

    public final void add(java.lang.Boolean bool) {
        this.elements.add(bool == null ? com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE : new com.nimbusds.jose.shaded.gson.JsonPrimitive(bool));
    }

    public final void add(java.lang.Character ch) {
        this.elements.add(ch == null ? com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE : new com.nimbusds.jose.shaded.gson.JsonPrimitive(ch));
    }

    public final void add(java.lang.Number number) {
        this.elements.add(number == null ? com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE : new com.nimbusds.jose.shaded.gson.JsonPrimitive(number));
    }

    public final void add(java.lang.String str) {
        this.elements.add(str == null ? com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE : new com.nimbusds.jose.shaded.gson.JsonPrimitive(str));
    }

    public final void add(com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE;
        }
        this.elements.add(jsonElement);
    }

    public final void addAll(com.nimbusds.jose.shaded.gson.JsonArray jsonArray) {
        this.elements.addAll(jsonArray.elements);
    }

    public final com.nimbusds.jose.shaded.gson.JsonElement set(int i, com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
        java.util.ArrayList<com.nimbusds.jose.shaded.gson.JsonElement> arrayList = this.elements;
        if (jsonElement == null) {
            jsonElement = com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE;
        }
        return arrayList.set(i, jsonElement);
    }

    public final boolean remove(com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
        return this.elements.remove(jsonElement);
    }

    public final com.nimbusds.jose.shaded.gson.JsonElement remove(int i) {
        return this.elements.remove(i);
    }

    public final boolean contains(com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
        return this.elements.contains(jsonElement);
    }

    public final int size() {
        return this.elements.size();
    }

    public final boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<com.nimbusds.jose.shaded.gson.JsonElement> iterator() {
        return this.elements.iterator();
    }

    public final com.nimbusds.jose.shaded.gson.JsonElement get(int i) {
        return this.elements.get(i);
    }

    private com.nimbusds.jose.shaded.gson.JsonElement getAsSingleElement() {
        int size = this.elements.size();
        if (size == 1) {
            return this.elements.get(0);
        }
        throw new java.lang.IllegalStateException("Array must have size 1, but has size ".concat(java.lang.String.valueOf(size)));
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final java.lang.Number getAsNumber() {
        return getAsSingleElement().getAsNumber();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final java.lang.String getAsString() {
        return getAsSingleElement().getAsString();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final double getAsDouble() {
        return getAsSingleElement().getAsDouble();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final java.math.BigDecimal getAsBigDecimal() {
        return getAsSingleElement().getAsBigDecimal();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final java.math.BigInteger getAsBigInteger() {
        return getAsSingleElement().getAsBigInteger();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final float getAsFloat() {
        return getAsSingleElement().getAsFloat();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final long getAsLong() {
        return getAsSingleElement().getAsLong();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final int getAsInt() {
        return getAsSingleElement().getAsInt();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final byte getAsByte() {
        return getAsSingleElement().getAsByte();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    @java.lang.Deprecated
    public final char getAsCharacter() {
        return getAsSingleElement().getAsCharacter();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final short getAsShort() {
        return getAsSingleElement().getAsShort();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final boolean getAsBoolean() {
        return getAsSingleElement().getAsBoolean();
    }

    public final java.util.List<com.nimbusds.jose.shaded.gson.JsonElement> asList() {
        return new com.nimbusds.jose.shaded.gson.internal.NonNullElementWrapperList(this.elements);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.nimbusds.jose.shaded.gson.JsonArray) && ((com.nimbusds.jose.shaded.gson.JsonArray) obj).elements.equals(this.elements);
        }
        return true;
    }

    public final int hashCode() {
        return this.elements.hashCode();
    }
}
