package org.modelmapper.spi;

/* loaded from: classes4.dex */
public enum NameableType {
    CLASS,
    METHOD,
    FIELD,
    GENERIC;

    public static NameableType forPropertyType(PropertyType propertyType) {
        if (PropertyType.FIELD.equals(propertyType)) {
            return FIELD;
        }
        if (PropertyType.METHOD.equals(propertyType)) {
            return METHOD;
        }
        if (PropertyType.GENERIC.equals(propertyType)) {
            return GENERIC;
        }
        return CLASS;
    }
}
