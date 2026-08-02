package org.jose4j.json.internal.json_simple;

/* loaded from: classes18.dex */
public class ItemList {
    java.util.List getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoSizes;

    public ItemList() {
        this.getHighSpeedVideoSizes = ",";
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    }

    public ItemList(java.lang.String str) {
        this.getHighSpeedVideoSizes = ",";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = arrayList;
        split(str, this.getHighSpeedVideoSizes, arrayList);
    }

    public ItemList(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoSizes = ",";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = arrayList;
        this.getHighSpeedVideoSizes = str;
        split(str, str2, arrayList);
    }

    public ItemList(java.lang.String str, java.lang.String str2, boolean z) {
        this.getHighSpeedVideoSizes = ",";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = arrayList;
        split(str, str2, arrayList, z);
    }

    public java.util.List getItems() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String[] getArray() {
        return (java.lang.String[]) this.getHighSpeedVideoFpsRanges.toArray();
    }

    public void split(java.lang.String str, java.lang.String str2, java.util.List list, boolean z) {
        if (str == null || str2 == null) {
            return;
        }
        if (z) {
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, str2);
            while (stringTokenizer.hasMoreTokens()) {
                list.add(stringTokenizer.nextToken().trim());
            }
            return;
        }
        split(str, str2, list);
    }

    public void split(java.lang.String str, java.lang.String str2, java.util.List list) {
        if (str == null || str2 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf == -1) {
                break;
            }
            list.add(str.substring(i, indexOf).trim());
            int length = indexOf + str2.length();
            if (length == -1) {
                break;
            } else {
                i = length;
            }
        }
        list.add(str.substring(i).trim());
    }

    public void setSP(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public void add(int i, java.lang.String str) {
        if (str == null) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.add(i, str.trim());
    }

    public void add(java.lang.String str) {
        if (str == null) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.add(str.trim());
    }

    public void addAll(org.jose4j.json.internal.json_simple.ItemList itemList) {
        this.getHighSpeedVideoFpsRanges.addAll(itemList.getHighSpeedVideoFpsRanges);
    }

    public void addAll(java.lang.String str) {
        split(str, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }

    public void addAll(java.lang.String str, java.lang.String str2) {
        split(str, str2, this.getHighSpeedVideoFpsRanges);
    }

    public void addAll(java.lang.String str, java.lang.String str2, boolean z) {
        split(str, str2, this.getHighSpeedVideoFpsRanges, z);
    }

    public java.lang.String get(int i) {
        return (java.lang.String) this.getHighSpeedVideoFpsRanges.get(i);
    }

    public int size() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    public java.lang.String toString() {
        return toString(this.getHighSpeedVideoSizes);
    }

    public java.lang.String toString(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
            if (i == 0) {
                sb.append(this.getHighSpeedVideoFpsRanges.get(i));
            } else {
                sb.append(str);
                sb.append(this.getHighSpeedVideoFpsRanges.get(i));
            }
        }
        return sb.toString();
    }

    public void clear() {
        this.getHighSpeedVideoFpsRanges.clear();
    }

    public void reset() {
        this.getHighSpeedVideoSizes = ",";
        this.getHighSpeedVideoFpsRanges.clear();
    }
}
