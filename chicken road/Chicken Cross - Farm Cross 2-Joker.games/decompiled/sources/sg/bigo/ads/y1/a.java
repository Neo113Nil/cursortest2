package sg.bigo.ads.y1;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.CDATASection;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public abstract class a {
    public static String a(Node node, String str) {
        Node namedItem;
        if (node == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public static Integer b(Node node, String str) {
        if (node != null) {
            String a2 = a(node, str);
            if (I.a((CharSequence) a2)) {
                return -1;
            }
            try {
                return Integer.valueOf(Integer.parseInt(a2));
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static String c(Node node, String str) {
        Node a2 = a(node, str, (String) null, (ArrayList) null);
        if (a2 == null) {
            return null;
        }
        String a3 = a(a2);
        if (I.a((CharSequence) a3)) {
            return null;
        }
        return a3;
    }

    public static String a(Node node) {
        if (node != null && node.hasChildNodes()) {
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item != null) {
                    String nodeValue = item.getNodeValue();
                    if (!(I.a((CharSequence) nodeValue) ? true : I.a((CharSequence) nodeValue.replaceAll("\\s*", "")))) {
                        return item.getNodeValue();
                    }
                }
            }
        }
        return null;
    }

    public static String b(Node node) {
        String nodeValue;
        if (node != null && node.hasChildNodes()) {
            NodeList childNodes = node.getChildNodes();
            int min = Math.min(childNodes.getLength(), 5);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    Node item = childNodes.item(i);
                    if ((item instanceof CDATASection) && item.getNodeValue() != null) {
                        nodeValue = item.getNodeValue();
                        break;
                    }
                }
            }
        }
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        nodeValue = node.getFirstChild().getNodeValue();
        return nodeValue.trim();
    }

    public static Node a(Node node, String str, String str2, ArrayList arrayList) {
        ArrayList a2;
        if (node == null || str == null || (a2 = a(node, str, str2, (List) arrayList)) == null || a2.isEmpty()) {
            return null;
        }
        return (Node) a2.get(0);
    }

    public static ArrayList a(Node node, String str, String str2, List list) {
        NamedNodeMap attributes;
        Node namedItem;
        if (node == null || str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(str) && (str2 == null || list == null || ((attributes = item.getAttributes()) != null && (namedItem = attributes.getNamedItem(str2)) != null && list.contains(namedItem.getNodeValue())))) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }
}
