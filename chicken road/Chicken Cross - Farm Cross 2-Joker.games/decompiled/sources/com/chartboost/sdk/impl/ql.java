package com.chartboost.sdk.impl;

import androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticThreadLocal1;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* loaded from: classes4.dex */
public final class ql {

    /* renamed from: a, reason: collision with root package name */
    public static final ql f4988a;
    public static final DocumentBuilderFactory b;
    public static final ThreadLocal c;

    static {
        ql qlVar = new ql();
        f4988a = qlVar;
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(false);
        newInstance.setValidating(false);
        Intrinsics.checkNotNull(newInstance);
        qlVar.a(newInstance, "http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        qlVar.a(newInstance, "http://xml.org/sax/features/external-general-entities", false);
        qlVar.a(newInstance, "http://xml.org/sax/features/external-parameter-entities", false);
        Intrinsics.checkNotNullExpressionValue(newInstance, "apply(...)");
        b = newInstance;
        c = new Utf8Old$$ExternalSyntheticThreadLocal1(new Supplier() { // from class: com.chartboost.sdk.impl.ql$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return ql.a();
            }
        });
    }

    public final void a(DocumentBuilderFactory documentBuilderFactory, String str, boolean z) {
        try {
            documentBuilderFactory.setFeature(str, z);
        } catch (Exception unused) {
            mb.e("XML feature not supported: " + str, null, 2, null);
        }
    }

    public final Element b(Element element, String tagName) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if (Intrinsics.areEqual(element2.getNodeName(), tagName)) {
                    return element2;
                }
            }
        }
        return null;
    }

    public final List c(Element element, String tagName) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if ((item instanceof Element) && Intrinsics.areEqual(((Element) item).getNodeName(), tagName)) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    public final String d(Element element, String tagName) {
        String obj;
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if (Intrinsics.areEqual(element2.getNodeName(), tagName)) {
                    String textContent = element2.getTextContent();
                    if (textContent == null || (obj = StringsKt.trim((CharSequence) textContent).toString()) == null || obj.length() <= 0) {
                        return null;
                    }
                    return obj;
                }
            }
        }
        return null;
    }

    public final List e(Element element, String tagName) {
        String textContent;
        String obj;
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if (Intrinsics.areEqual(element2.getNodeName(), tagName) && (textContent = element2.getTextContent()) != null && (obj = StringsKt.trim((CharSequence) textContent).toString()) != null) {
                    if (obj.length() <= 0) {
                        obj = null;
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final DocumentBuilder a() {
        return b.newDocumentBuilder();
    }

    public final Object a(String xmlString) {
        Intrinsics.checkNotNullParameter(xmlString, "xmlString");
        try {
            DocumentBuilder documentBuilder = (DocumentBuilder) c.get();
            documentBuilder.reset();
            Document parse = documentBuilder.parse(new InputSource(new StringReader(xmlString)));
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(parse);
        } catch (Exception e) {
            mb.b("Error parsing XML string.", e);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new ab("Error parsing VAST XML: " + e.getMessage(), null, 2, null)));
        }
    }

    public final String a(Element element, String name) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (element.hasAttribute(name)) {
            String attribute = element.getAttribute(name);
            Intrinsics.checkNotNullExpressionValue(attribute, "getAttribute(...)");
            String obj = StringsKt.trim((CharSequence) attribute).toString();
            if (obj.length() > 0) {
                return obj;
            }
        }
        return null;
    }
}
