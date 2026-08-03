package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class w1 {
    public static java.lang.Integer a(org.w3c.dom.Node node, java.lang.String str) {
        java.lang.String b = b(node, str);
        if (android.text.TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(b);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.lang.String b(org.w3c.dom.Node node, java.lang.String str) {
        org.w3c.dom.Node namedItem;
        if (node == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public static java.util.ArrayList c(org.w3c.dom.Node node, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.w3c.dom.NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            org.w3c.dom.Node item = childNodes.item(i);
            if (item.getNodeName().equals(str)) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    public static org.w3c.dom.Node d(org.w3c.dom.Node node, java.lang.String str) {
        if (node == null) {
            return null;
        }
        org.w3c.dom.NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            org.w3c.dom.Node item = childNodes.item(i);
            if (item.getNodeName().equals(str)) {
                return item;
            }
        }
        return null;
    }

    public static java.lang.String a(org.w3c.dom.Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }
}
