package com.google.gson;

/* loaded from: classes4.dex */
public final class JsonArray extends com.google.gson.JsonElement implements java.lang.Iterable<com.google.gson.JsonElement> {
    private final java.util.ArrayList<com.google.gson.JsonElement> elements;

    public JsonArray() {
        this.elements = new java.util.ArrayList<>();
    }

    public JsonArray(int i) {
        this.elements = new java.util.ArrayList<>(i);
    }

    @Override // com.google.gson.JsonElement
    public final com.google.gson.JsonArray deepCopy() {
        if (!this.elements.isEmpty()) {
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.elements.size());
            java.util.Iterator<com.google.gson.JsonElement> it = this.elements.iterator();
            while (it.hasNext()) {
                jsonArray.add(it.next().deepCopy());
            }
            return jsonArray;
        }
        return new com.google.gson.JsonArray();
    }

    public final void add(java.lang.Boolean bool) {
        this.elements.add(bool == null ? com.google.gson.JsonNull.INSTANCE : new com.google.gson.JsonPrimitive(bool));
    }

    public final void add(java.lang.Character ch) {
        this.elements.add(ch == null ? com.google.gson.JsonNull.INSTANCE : new com.google.gson.JsonPrimitive(ch));
    }

    public final void add(java.lang.Number number) {
        this.elements.add(number == null ? com.google.gson.JsonNull.INSTANCE : new com.google.gson.JsonPrimitive(number));
    }

    public final void add(java.lang.String str) {
        this.elements.add(str == null ? com.google.gson.JsonNull.INSTANCE : new com.google.gson.JsonPrimitive(str));
    }

    public final void add(com.google.gson.JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = com.google.gson.JsonNull.INSTANCE;
        }
        this.elements.add(jsonElement);
    }

    public final void addAll(com.google.gson.JsonArray jsonArray) {
        this.elements.addAll(jsonArray.elements);
    }

    public final com.google.gson.JsonElement set(int i, com.google.gson.JsonElement jsonElement) {
        java.util.ArrayList<com.google.gson.JsonElement> arrayList = this.elements;
        if (jsonElement == null) {
            jsonElement = com.google.gson.JsonNull.INSTANCE;
        }
        return arrayList.set(i, jsonElement);
    }

    public final boolean remove(com.google.gson.JsonElement jsonElement) {
        return this.elements.remove(jsonElement);
    }

    public final com.google.gson.JsonElement remove(int i) {
        return this.elements.remove(i);
    }

    public final boolean contains(com.google.gson.JsonElement jsonElement) {
        return this.elements.contains(jsonElement);
    }

    public final int size() {
        return this.elements.size();
    }

    public final boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<com.google.gson.JsonElement> iterator() {
        return this.elements.iterator();
    }

    public final com.google.gson.JsonElement get(int i) {
        return this.elements.get(i);
    }

    private com.google.gson.JsonElement getAsSingleElement() {
        int size = this.elements.size();
        if (size == 1) {
            return this.elements.get(0);
        }
        throw new java.lang.IllegalStateException("Array must have size 1, but has size ".concat(java.lang.String.valueOf(size)));
    }

    @Override // com.google.gson.JsonElement
    public final java.lang.Number getAsNumber() {
        return getAsSingleElement().getAsNumber();
    }

    @Override // com.google.gson.JsonElement
    public final java.lang.String getAsString() {
        return getAsSingleElement().getAsString();
    }

    @Override // com.google.gson.JsonElement
    public final double getAsDouble() {
        return getAsSingleElement().getAsDouble();
    }

    @Override // com.google.gson.JsonElement
    public final java.math.BigDecimal getAsBigDecimal() {
        return getAsSingleElement().getAsBigDecimal();
    }

    @Override // com.google.gson.JsonElement
    public final java.math.BigInteger getAsBigInteger() {
        return getAsSingleElement().getAsBigInteger();
    }

    @Override // com.google.gson.JsonElement
    public final float getAsFloat() {
        return getAsSingleElement().getAsFloat();
    }

    @Override // com.google.gson.JsonElement
    public final long getAsLong() {
        return getAsSingleElement().getAsLong();
    }

    @Override // com.google.gson.JsonElement
    public final int getAsInt() {
        return getAsSingleElement().getAsInt();
    }

    @Override // com.google.gson.JsonElement
    public final byte getAsByte() {
        return getAsSingleElement().getAsByte();
    }

    @Override // com.google.gson.JsonElement
    @java.lang.Deprecated
    public final char getAsCharacter() {
        return getAsSingleElement().getAsCharacter();
    }

    @Override // com.google.gson.JsonElement
    public final short getAsShort() {
        return getAsSingleElement().getAsShort();
    }

    @Override // com.google.gson.JsonElement
    public final boolean getAsBoolean() {
        return getAsSingleElement().getAsBoolean();
    }

    public final java.util.List<com.google.gson.JsonElement> asList() {
        return new com.google.gson.internal.NonNullElementWrapperList(this.elements);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.gson.JsonArray) && ((com.google.gson.JsonArray) obj).elements.equals(this.elements);
        }
        return true;
    }

    public final int hashCode() {
        return this.elements.hashCode();
    }
}
