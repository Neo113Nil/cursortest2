package com.facetec.sdk;

/* loaded from: classes8.dex */
final class br {
    private static final float[] e = {1.7f, 1.6f, 1.5f, 1.4f, 1.3f};

    br() {
    }

    static com.facetec.sdk.ao b(android.hardware.Camera camera) {
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.hardware.Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new com.facetec.sdk.ao(size.width, size.height));
        }
        return c(arrayList);
    }

    static com.facetec.sdk.ao e(android.util.Size[] sizeArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : sizeArr) {
            arrayList.add(new com.facetec.sdk.ao(size.getWidth(), size.getHeight()));
        }
        return c(arrayList);
    }

    private static com.facetec.sdk.ao c(java.util.List<com.facetec.sdk.ao> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: com.facetec.sdk.br$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int a2;
                a2 = com.facetec.sdk.br.a((com.facetec.sdk.ao) obj, (com.facetec.sdk.ao) obj2);
                return a2;
            }
        });
        double random = java.lang.Math.random();
        int i = 3;
        for (float f : e) {
            for (com.facetec.sdk.ao aoVar : list) {
                float f2 = aoVar.b;
                float f3 = aoVar.c;
                float f4 = f2 / f3;
                if (f4 >= f && f4 <= 1.9f) {
                    if (random < 0.7d) {
                        if (f2 < 640.0f || f2 > 3840.0f) {
                            i = 1;
                        } else {
                            i = 1;
                            arrayList.add(aoVar);
                        }
                    } else if (random < 0.85d) {
                        if (f2 >= 640.0f && f2 <= 1920.0f && f3 <= 1080.0f) {
                            arrayList.add(aoVar);
                        }
                    } else if (f2 <= 1920.0f && f3 <= 1080.0f && f2 >= 640.0f) {
                        arrayList.add(aoVar);
                    }
                }
            }
            if (arrayList.size() > 0) {
                break;
            }
        }
        com.facetec.sdk.cq.E(i);
        if (!arrayList.isEmpty()) {
            return (com.facetec.sdk.ao) arrayList.get(0);
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(com.facetec.sdk.ao aoVar, com.facetec.sdk.ao aoVar2) {
        return (aoVar2.b * aoVar2.c) - (aoVar.b * aoVar.c);
    }
}
