package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzgg {
    static java.lang.String zza(com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zzgeVar, sb, 0);
        return sb.toString();
    }

    static final void zzb(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.play_games_inputmapping.zzhb.zza(com.google.android.gms.internal.play_games_inputmapping.zzek.zzj((java.lang.String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.play_games_inputmapping.zzhb.zza((com.google.android.gms.internal.play_games_inputmapping.zzek) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzfc) {
            sb.append(" {");
            zzc((com.google.android.gms.internal.play_games_inputmapping.zzfc) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int i4 = i + 2;
        zzb(sb, i4, com.ironsource.X3.i.W, entry.getKey());
        zzb(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    private static void zzc(com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar, java.lang.StringBuilder sb, int i) {
        boolean equals;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet();
        for (java.lang.reflect.Method method : zzgeVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (java.lang.String str : treeSet) {
            java.lang.String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                java.lang.String lowerCase = substring.substring(0, 1).toLowerCase();
                java.lang.String substring2 = substring.substring(1, substring.length() - 4);
                java.lang.String.valueOf(lowerCase);
                java.lang.String.valueOf(substring2);
                java.lang.String concat = java.lang.String.valueOf(lowerCase).concat(java.lang.String.valueOf(substring2));
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(java.util.List.class)) {
                    zzb(sb, i, zzd(concat), com.google.android.gms.internal.play_games_inputmapping.zzfc.zzq(method2, zzgeVar, new java.lang.Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                java.lang.String lowerCase2 = substring.substring(0, 1).toLowerCase();
                java.lang.String substring3 = substring.substring(1, substring.length() - 3);
                java.lang.String.valueOf(lowerCase2);
                java.lang.String.valueOf(substring3);
                java.lang.String concat2 = java.lang.String.valueOf(lowerCase2).concat(java.lang.String.valueOf(substring3));
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzd(concat2), com.google.android.gms.internal.play_games_inputmapping.zzfc.zzq(method3, zzgeVar, new java.lang.Object[0]));
                }
            }
            java.lang.String.valueOf(substring);
            if (((java.lang.reflect.Method) hashMap2.get("set".concat(java.lang.String.valueOf(substring)))) != null) {
                if (substring.endsWith("Bytes")) {
                    java.lang.String substring4 = substring.substring(0, substring.length() - 5);
                    java.lang.String.valueOf(substring4);
                    if (!hashMap.containsKey("get".concat(java.lang.String.valueOf(substring4)))) {
                    }
                }
                java.lang.String lowerCase3 = substring.substring(0, 1).toLowerCase();
                java.lang.String substring5 = substring.substring(1);
                java.lang.String.valueOf(lowerCase3);
                java.lang.String.valueOf(substring5);
                java.lang.String concat3 = java.lang.String.valueOf(lowerCase3).concat(java.lang.String.valueOf(substring5));
                java.lang.String.valueOf(substring);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) hashMap.get("get".concat(java.lang.String.valueOf(substring)));
                java.lang.String.valueOf(substring);
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(java.lang.String.valueOf(substring)));
                if (method4 != null) {
                    java.lang.Object zzq = com.google.android.gms.internal.play_games_inputmapping.zzfc.zzq(method4, zzgeVar, new java.lang.Object[0]);
                    if (method5 == null) {
                        if (zzq instanceof java.lang.Boolean) {
                            if (((java.lang.Boolean) zzq).booleanValue()) {
                                zzb(sb, i, zzd(concat3), zzq);
                            }
                        } else if (zzq instanceof java.lang.Integer) {
                            if (((java.lang.Integer) zzq).intValue() != 0) {
                                zzb(sb, i, zzd(concat3), zzq);
                            }
                        } else if (zzq instanceof java.lang.Float) {
                            if (java.lang.Float.floatToRawIntBits(((java.lang.Float) zzq).floatValue()) != 0) {
                                zzb(sb, i, zzd(concat3), zzq);
                            }
                        } else if (!(zzq instanceof java.lang.Double)) {
                            if (zzq instanceof java.lang.String) {
                                equals = zzq.equals("");
                            } else if (zzq instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) {
                                equals = zzq.equals(com.google.android.gms.internal.play_games_inputmapping.zzek.zzb);
                            } else if (!(zzq instanceof com.google.android.gms.internal.play_games_inputmapping.zzge)) {
                                if ((zzq instanceof java.lang.Enum) && ((java.lang.Enum) zzq).ordinal() == 0) {
                                }
                                zzb(sb, i, zzd(concat3), zzq);
                            } else if (zzq != ((com.google.android.gms.internal.play_games_inputmapping.zzge) zzq).zzm()) {
                                zzb(sb, i, zzd(concat3), zzq);
                            }
                            if (!equals) {
                                zzb(sb, i, zzd(concat3), zzq);
                            }
                        } else if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) zzq).doubleValue()) != 0) {
                            zzb(sb, i, zzd(concat3), zzq);
                        }
                    } else if (((java.lang.Boolean) com.google.android.gms.internal.play_games_inputmapping.zzfc.zzq(method5, zzgeVar, new java.lang.Object[0])).booleanValue()) {
                        zzb(sb, i, zzd(concat3), zzq);
                    }
                }
            }
        }
        if (zzgeVar instanceof com.google.android.gms.internal.play_games_inputmapping.zzfa) {
            com.google.android.gms.internal.play_games_inputmapping.zzew zzewVar = ((com.google.android.gms.internal.play_games_inputmapping.zzfa) zzgeVar).zzb;
            throw null;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhe zzheVar = ((com.google.android.gms.internal.play_games_inputmapping.zzfc) zzgeVar).zzc;
        if (zzheVar != null) {
            zzheVar.zze(sb, i);
        }
    }

    private static final java.lang.String zzd(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
