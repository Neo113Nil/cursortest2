package upi.util;

/* loaded from: classes18.dex */
public class BerTlvEncoder {
    public static int a(int i) {
        if (i < 127) {
            return 1;
        }
        if (i <= 255) {
            return 2;
        }
        if (i <= 65535) {
            return 3;
        }
        return i <= 16777215 ? 4 : 5;
    }

    public static byte[] encode(java.util.List<common.emv.configuration.DataObjectList> list, java.lang.String str, java.lang.String str2) {
        if (list == null) {
            return null;
        }
        java.util.Iterator<common.emv.configuration.DataObjectList> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int a2 = a(it.next());
            i = i + (str2.length() / 2) + a(a2) + a2;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i + a(i) + (str.length() / 2));
        allocate.put(new common.emv.util.Tag(common.emv.util.HexUtil.decode(str)).getBytes());
        int remaining = allocate.remaining();
        int i2 = remaining - 1;
        if (i2 < 127) {
            allocate.put(common.emv.util.BerTlv.encodeLength(i2));
        } else {
            int i3 = remaining - 2;
            if (i3 < 255) {
                allocate.put(common.emv.util.BerTlv.encodeLength(i3));
            } else {
                int i4 = remaining - 3;
                if (i4 < 65535) {
                    allocate.put(common.emv.util.BerTlv.encodeLength(i4));
                } else {
                    int i5 = remaining - 4;
                    if (i5 < 16777215) {
                        allocate.put(common.emv.util.BerTlv.encodeLength(i5));
                    } else {
                        allocate.put(common.emv.util.BerTlv.encodeLength(remaining - 5));
                    }
                }
            }
        }
        common.emv.util.Tag tag = new common.emv.util.Tag(common.emv.util.HexUtil.decode(str2));
        java.util.Iterator<common.emv.configuration.DataObjectList> it2 = list.iterator();
        while (it2.hasNext()) {
            byte[] encode = encode(it2.next());
            allocate.put(tag.getBytes());
            allocate.put(common.emv.util.BerTlv.encodeLength(encode.length));
            allocate.put(encode);
        }
        return allocate.array();
    }

    public static byte[] encode(common.emv.configuration.DataObjectList dataObjectList) {
        if (dataObjectList == null) {
            return null;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(a(dataObjectList));
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : dataObjectList.entrySet()) {
            common.emv.util.Tag tag = new common.emv.util.Tag(common.emv.util.HexUtil.decode(entry.getKey()));
            byte[] decode = common.emv.util.HexUtil.decode(entry.getValue());
            allocate.put(tag.getBytes());
            allocate.put(common.emv.util.BerTlv.encodeLength(decode.length));
            allocate.put(decode);
        }
        return allocate.array();
    }

    public static int a(common.emv.configuration.DataObjectList dataObjectList) {
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : dataObjectList.entrySet()) {
            int length = entry.getKey().length() / 2;
            int length2 = entry.getValue().length() / 2;
            i += length + a(length2) + length2;
        }
        return i;
    }
}
