package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
public class IdentityMap {
    final java.util.Map<java.lang.String, java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem>> getHighSpeedVideoSizes = new java.util.HashMap();

    public java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem> getIdentityItemsForNamespace(java.lang.String str) {
        java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) && (list = this.getHighSpeedVideoSizes.get(str)) != null) {
            java.util.Iterator<com.adobe.marketing.mobile.edge.identity.IdentityItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.adobe.marketing.mobile.edge.identity.IdentityItem(it.next()));
            }
        }
        return arrayList;
    }

    public java.util.List<java.lang.String> getNamespaces() {
        return new java.util.ArrayList(this.getHighSpeedVideoSizes.keySet());
    }

    public void addItem(com.adobe.marketing.mobile.edge.identity.IdentityItem identityItem, java.lang.String str) {
        getHighSpeedVideoSizes(identityItem, str, false);
    }

    public void removeItem(com.adobe.marketing.mobile.edge.identity.IdentityItem identityItem, java.lang.String str) {
        if (identityItem == null) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityMap", "Remove item ignored as must contain a non-null IdentityItem.", new java.lang.Object[0]);
            return;
        }
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityMap", "Remove item ignored as must contain a non-null/non-empty namespace.", new java.lang.Object[0]);
            return;
        }
        if (this.getHighSpeedVideoSizes.containsKey(str)) {
            java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem> list = this.getHighSpeedVideoSizes.get(str);
            list.remove(identityItem);
            if (list.isEmpty()) {
                this.getHighSpeedVideoSizes.remove(str);
            }
        }
    }

    public boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("{\"identityMap\": {");
        for (java.util.Map.Entry<java.lang.String, java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem>> entry : this.getHighSpeedVideoSizes.entrySet()) {
            sb.append("\"");
            sb.append(entry.getKey());
            sb.append("\": [");
            java.util.Iterator<com.adobe.marketing.mobile.edge.identity.IdentityItem> it = entry.getValue().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            if (!entry.getValue().isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("],");
        }
        if (!this.getHighSpeedVideoSizes.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("}}");
        return sb.toString();
    }

    final void getHighSpeedVideoSizes(com.adobe.marketing.mobile.edge.identity.IdentityItem identityItem, java.lang.String str, boolean z) {
        if (identityItem == null) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityMap", "Add item ignored as must contain a non-null IdentityItem.", new java.lang.Object[0]);
        } else if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityMap", "Add item ignored as must contain a non-null/non-empty namespace.", new java.lang.Object[0]);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(identityItem, str, z);
        }
    }

    final boolean Camera2StreamConfigurationMap(java.lang.String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : this.getHighSpeedVideoSizes.keySet()) {
            if (str.equalsIgnoreCase(str2)) {
                arrayList.add(str2);
                z = true;
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.getHighSpeedVideoSizes.remove((java.lang.String) it.next());
        }
        return z;
    }

    final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor(boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.lang.String str : this.getHighSpeedVideoSizes.keySet()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.adobe.marketing.mobile.edge.identity.IdentityItem> it = this.getHighSpeedVideoSizes.get(str).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getHighResolutionOutputSizeshNQ4ISI());
            }
            hashMap2.put(str, arrayList);
        }
        if (hashMap2.isEmpty() && !z) {
            return hashMap;
        }
        hashMap.put("identityMap", hashMap2);
        return hashMap;
    }

    static com.adobe.marketing.mobile.edge.identity.IdentityMap getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map optTypedMap;
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map) || (optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, map, "identityMap", null)) == null) {
            return null;
        }
        com.adobe.marketing.mobile.edge.identity.IdentityMap identityMap = new com.adobe.marketing.mobile.edge.identity.IdentityMap();
        for (java.lang.String str : optTypedMap.keySet()) {
            java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, optTypedMap, str, null);
            if (optTypedListOfMap != null) {
                java.util.Iterator it = optTypedListOfMap.iterator();
                while (it.hasNext()) {
                    com.adobe.marketing.mobile.edge.identity.IdentityItem highSpeedVideoSizes = com.adobe.marketing.mobile.edge.identity.IdentityItem.getHighSpeedVideoSizes((java.util.Map) it.next());
                    if (highSpeedVideoSizes != null) {
                        identityMap.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes, str, false);
                    }
                }
            }
        }
        return identityMap;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.edge.identity.IdentityItem identityItem, java.lang.String str, boolean z) {
        java.util.List<com.adobe.marketing.mobile.edge.identity.IdentityItem> arrayList;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(identityItem.getId())) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityMap", "Unable to add IdentityItem to IdentityMap with null or empty identifier value: %s", identityItem);
            return;
        }
        if (this.getHighSpeedVideoSizes.containsKey(str)) {
            arrayList = this.getHighSpeedVideoSizes.get(str);
        } else {
            arrayList = new java.util.ArrayList<>();
        }
        int indexOf = arrayList.indexOf(identityItem);
        if (indexOf >= 0) {
            arrayList.set(indexOf, identityItem);
        } else if (z) {
            arrayList.add(0, identityItem);
        } else {
            arrayList.add(identityItem);
        }
        this.getHighSpeedVideoSizes.put(str, arrayList);
    }
}
