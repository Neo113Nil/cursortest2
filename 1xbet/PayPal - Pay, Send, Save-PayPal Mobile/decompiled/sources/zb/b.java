package zb;

/* loaded from: classes18.dex */
public class b {
    public static common.emv.configuration.ConfigurationTemplate a(java.io.InputStream... inputStreamArr) {
        try {
            common.emv.configuration.DataObjectList dataObjectList = new common.emv.configuration.DataObjectList();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            for (java.io.InputStream inputStream : inputStreamArr) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                while (true) {
                    int read = inputStream.read();
                    if (read != -1) {
                        byteArrayOutputStream.write(read);
                    }
                }
                inputStream.close();
                byteArrayOutputStream.close();
                org.json.JSONObject jSONObject = new org.json.JSONObject(new org.json.JSONTokener(byteArrayOutputStream.toString("UTF-8")));
                d(dataObjectList, jSONObject.optJSONArray("TERMINAL"));
                a(linkedHashMap, jSONObject.optJSONArray("APPLICATION"));
                b(linkedHashMap2, jSONObject.optJSONArray("CA"));
                c(linkedHashMap3, jSONObject.optJSONArray("REVOCATION_LIST"));
            }
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.String substring = ((java.lang.String) entry.getKey()).substring(0, 10);
                common.emv.configuration.ApplicationConfigurationBuilder applicationConfigurationBuilder = (common.emv.configuration.ApplicationConfigurationBuilder) entry.getValue();
                java.util.List list = (java.util.List) linkedHashMap2.get(substring);
                if (list != null && list.size() > 0) {
                    applicationConfigurationBuilder.getCa().addAll(list);
                }
            }
            if (!linkedHashMap3.isEmpty()) {
                for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                    java.lang.String substring2 = ((java.lang.String) entry2.getKey()).substring(0, 10);
                    common.emv.configuration.ApplicationConfigurationBuilder applicationConfigurationBuilder2 = (common.emv.configuration.ApplicationConfigurationBuilder) entry2.getValue();
                    java.util.List list2 = (java.util.List) linkedHashMap3.get(substring2);
                    if (list2 != null && !list2.isEmpty()) {
                        applicationConfigurationBuilder2.getCrl().addAll(list2);
                    }
                }
            }
            return new common.emv.configuration.ConfigurationTemplate(dataObjectList, linkedHashMap);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static void d(java.util.Map<java.lang.String, java.lang.String> map, org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
            java.lang.String optString = optJSONObject.optString("TAG", null);
            if (optString != null && optString.length() != 0) {
                java.lang.Object opt = optJSONObject.opt("VALUE");
                if (opt instanceof java.lang.String) {
                    map.put(optString, (java.lang.String) opt);
                } else {
                    map.remove(optString);
                }
            }
        }
    }

    public static void a(java.util.Map<java.lang.String, common.emv.configuration.ApplicationConfigurationBuilder> map, org.json.JSONArray jSONArray) {
        org.json.JSONArray jSONArray2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.util.Map<java.lang.String, common.emv.configuration.ApplicationConfigurationBuilder> map2 = map;
        if (a(jSONArray)) {
            return;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
            java.lang.String optString = optJSONObject.optString("AID");
            java.lang.String optString2 = optJSONObject.optString("KERNEL_ID");
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("ENTRY_CONFIG");
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("CONFIG");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(optString);
            sb.append(optString2);
            common.emv.configuration.ApplicationConfigurationBuilder applicationConfigurationBuilder = map2.get(sb.toString());
            if (applicationConfigurationBuilder == null) {
                applicationConfigurationBuilder = new common.emv.configuration.ApplicationConfigurationBuilder(optString, optString2);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(optString);
                sb2.append(optString2);
                map2.put(sb2.toString(), applicationConfigurationBuilder);
            }
            java.lang.Object opt = optJSONObject.opt("TRANSACTION_TYPE");
            java.lang.String str6 = "STATUS_CHECK_SUPPORT";
            java.lang.String str7 = "EXTENDED_SELECTION_SUPPORT";
            int i2 = i;
            if (opt == null) {
                common.emv.kernel.TransactionData.TransactionType[] values = common.emv.kernel.TransactionData.TransactionType.values();
                java.lang.String str8 = "LIST_OF_AIDS_SUPPORTED_FOR_NON_PPSE";
                java.lang.String str9 = "TTQ";
                int i3 = 0;
                while (i3 < 11) {
                    common.emv.kernel.TransactionData.TransactionType transactionType = values[i3];
                    common.emv.kernel.TransactionData.TransactionType[] transactionTypeArr = values;
                    if (optJSONArray != null) {
                        d(applicationConfigurationBuilder.getConfiguration(transactionType.code), optJSONArray);
                    }
                    if (optJSONObject2 != null) {
                        final common.emv.configuration.EntryConfigurationData.Builder entryConfigurationDataBuilder = applicationConfigurationBuilder.getEntryConfigurationDataBuilder(transactionType.code);
                        java.util.Objects.requireNonNull(entryConfigurationDataBuilder);
                        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda0
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setStatusCheckSupport((java.lang.Boolean) obj);
                            }
                        };
                        if (optJSONObject2.has(str6)) {
                            str4 = str6;
                            consumer.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean(str6)));
                        } else {
                            str4 = str6;
                        }
                        java.util.function.Consumer consumer2 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda1
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setZeroAmountAllowed((java.lang.Boolean) obj);
                            }
                        };
                        if (optJSONObject2.has("ZERO_AMT_ALLOWED")) {
                            consumer2.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("ZERO_AMT_ALLOWED")));
                        }
                        java.util.function.Consumer consumer3 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda2
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setZeroAmountOfflineAllowed((java.lang.Boolean) obj);
                            }
                        };
                        if (optJSONObject2.has("ZERO_AMT_OFFLINE_ALLOWED")) {
                            consumer3.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("ZERO_AMT_OFFLINE_ALLOWED")));
                        }
                        java.util.function.Consumer consumer4 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda3
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setAllowFormatError((java.lang.Boolean) obj);
                            }
                        };
                        if (optJSONObject2.has("ALLOW_FORMAT_ERROR")) {
                            consumer4.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("ALLOW_FORMAT_ERROR")));
                        }
                        java.util.function.Consumer consumer5 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda4
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setExtendedSelectionSupport((java.lang.Boolean) obj);
                            }
                        };
                        if (optJSONObject2.has("EXTENDED_SELECTION_SUPPORT")) {
                            consumer5.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("EXTENDED_SELECTION_SUPPORT")));
                        }
                        a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda5
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setReaderContactlessFloorLimit((java.lang.Long) obj);
                            }
                        }, optJSONObject2, "CONTACTLESS_FLOOR_LMT");
                        a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda6
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setReaderContactlessTransactionLimit((java.lang.Long) obj);
                            }
                        }, optJSONObject2, "CONTACTLESS_TRX_LMT");
                        a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda7
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setReaderCvmRequiredLimit((java.lang.Long) obj);
                            }
                        }, optJSONObject2, "CVM_REQUIRED_LMT");
                        a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda8
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setReaderCvmRequiredLimitCashback((java.lang.Long) obj);
                            }
                        }, optJSONObject2, "CVM_REQUIRED_LMT_CASHBACK");
                        a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda9
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                common.emv.configuration.EntryConfigurationData.Builder.this.setTerminalFloorLimit((java.lang.Long) obj);
                            }
                        }, optJSONObject2, "TERMINAL_FLOOR_LMT");
                        java.lang.String str10 = str9;
                        if (optJSONObject2.has(str10)) {
                            entryConfigurationDataBuilder.setTerminalTransactionQualifier(common.emv.util.HexUtil.decode(optJSONObject2.optString(str10)));
                        }
                        str5 = str8;
                        str9 = str10;
                        if (optJSONObject2.has(str5)) {
                            entryConfigurationDataBuilder.setListOfSupportedAidsForNonPPSE(optJSONObject2.optString(str5));
                        }
                    } else {
                        str4 = str6;
                        str5 = str8;
                    }
                    i3++;
                    str8 = str5;
                    values = transactionTypeArr;
                    str6 = str4;
                }
            } else if (opt instanceof java.lang.String) {
                if (optJSONArray != null) {
                    d(applicationConfigurationBuilder.getConfiguration((java.lang.String) opt), optJSONArray);
                }
                if (optJSONObject2 != null) {
                    final common.emv.configuration.EntryConfigurationData.Builder entryConfigurationDataBuilder2 = applicationConfigurationBuilder.getEntryConfigurationDataBuilder((java.lang.String) opt);
                    java.util.Objects.requireNonNull(entryConfigurationDataBuilder2);
                    java.util.function.Consumer consumer6 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda0
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setStatusCheckSupport((java.lang.Boolean) obj);
                        }
                    };
                    if (optJSONObject2.has("STATUS_CHECK_SUPPORT")) {
                        consumer6.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("STATUS_CHECK_SUPPORT")));
                    }
                    java.util.function.Consumer consumer7 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda1
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setZeroAmountAllowed((java.lang.Boolean) obj);
                        }
                    };
                    if (optJSONObject2.has("ZERO_AMT_ALLOWED")) {
                        consumer7.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("ZERO_AMT_ALLOWED")));
                    }
                    java.util.function.Consumer consumer8 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda2
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setZeroAmountOfflineAllowed((java.lang.Boolean) obj);
                        }
                    };
                    if (optJSONObject2.has("ZERO_AMT_OFFLINE_ALLOWED")) {
                        consumer8.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("ZERO_AMT_OFFLINE_ALLOWED")));
                    }
                    java.util.function.Consumer consumer9 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda3
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setAllowFormatError((java.lang.Boolean) obj);
                        }
                    };
                    if (optJSONObject2.has("ALLOW_FORMAT_ERROR")) {
                        consumer9.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("ALLOW_FORMAT_ERROR")));
                    }
                    java.util.function.Consumer consumer10 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda4
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setExtendedSelectionSupport((java.lang.Boolean) obj);
                        }
                    };
                    if (optJSONObject2.has("EXTENDED_SELECTION_SUPPORT")) {
                        consumer10.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("EXTENDED_SELECTION_SUPPORT")));
                    }
                    a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda5
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setReaderContactlessFloorLimit((java.lang.Long) obj);
                        }
                    }, optJSONObject2, "CONTACTLESS_FLOOR_LMT");
                    a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda6
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setReaderContactlessTransactionLimit((java.lang.Long) obj);
                        }
                    }, optJSONObject2, "CONTACTLESS_TRX_LMT");
                    a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda7
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setReaderCvmRequiredLimit((java.lang.Long) obj);
                        }
                    }, optJSONObject2, "CVM_REQUIRED_LMT");
                    a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda8
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setReaderCvmRequiredLimitCashback((java.lang.Long) obj);
                        }
                    }, optJSONObject2, "CVM_REQUIRED_LMT_CASHBACK");
                    a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda9
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            common.emv.configuration.EntryConfigurationData.Builder.this.setTerminalFloorLimit((java.lang.Long) obj);
                        }
                    }, optJSONObject2, "TERMINAL_FLOOR_LMT");
                    if (optJSONObject2.has("TTQ")) {
                        entryConfigurationDataBuilder2.setTerminalTransactionQualifier(common.emv.util.HexUtil.decode(optJSONObject2.optString("TTQ")));
                    }
                    if (optJSONObject2.has("LIST_OF_AIDS_SUPPORTED_FOR_NON_PPSE")) {
                        entryConfigurationDataBuilder2.setListOfSupportedAidsForNonPPSE(optJSONObject2.optString("LIST_OF_AIDS_SUPPORTED_FOR_NON_PPSE"));
                    }
                }
            } else {
                java.lang.String str11 = "LIST_OF_AIDS_SUPPORTED_FOR_NON_PPSE";
                if (opt instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray3 = (org.json.JSONArray) opt;
                    int length = jSONArray3.length();
                    java.lang.String str12 = "TTQ";
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = length;
                        java.lang.String optString3 = jSONArray3.optString(i4);
                        org.json.JSONArray jSONArray4 = jSONArray3;
                        if (optJSONArray != null) {
                            d(applicationConfigurationBuilder.getConfiguration(optString3), optJSONArray);
                        }
                        if (optJSONObject2 != null) {
                            final common.emv.configuration.EntryConfigurationData.Builder entryConfigurationDataBuilder3 = applicationConfigurationBuilder.getEntryConfigurationDataBuilder(optString3);
                            java.util.Objects.requireNonNull(entryConfigurationDataBuilder3);
                            java.util.function.Consumer consumer11 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda0
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setStatusCheckSupport((java.lang.Boolean) obj);
                                }
                            };
                            if (optJSONObject2.has("STATUS_CHECK_SUPPORT")) {
                                jSONArray2 = optJSONArray;
                                consumer11.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("STATUS_CHECK_SUPPORT")));
                            } else {
                                jSONArray2 = optJSONArray;
                            }
                            java.util.function.Consumer consumer12 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda1
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setZeroAmountAllowed((java.lang.Boolean) obj);
                                }
                            };
                            if (optJSONObject2.has("ZERO_AMT_ALLOWED")) {
                                consumer12.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("ZERO_AMT_ALLOWED")));
                            }
                            java.util.function.Consumer consumer13 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda2
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setZeroAmountOfflineAllowed((java.lang.Boolean) obj);
                                }
                            };
                            if (optJSONObject2.has("ZERO_AMT_OFFLINE_ALLOWED")) {
                                consumer13.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("ZERO_AMT_OFFLINE_ALLOWED")));
                            }
                            java.util.function.Consumer consumer14 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda3
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setAllowFormatError((java.lang.Boolean) obj);
                                }
                            };
                            if (optJSONObject2.has("ALLOW_FORMAT_ERROR")) {
                                consumer14.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean("ALLOW_FORMAT_ERROR")));
                            }
                            java.util.function.Consumer consumer15 = new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda4
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setExtendedSelectionSupport((java.lang.Boolean) obj);
                                }
                            };
                            if (optJSONObject2.has(str7)) {
                                consumer15.accept(java.lang.Boolean.valueOf(optJSONObject2.optBoolean(str7)));
                            }
                            a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda5
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setReaderContactlessFloorLimit((java.lang.Long) obj);
                                }
                            }, optJSONObject2, "CONTACTLESS_FLOOR_LMT");
                            a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda6
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setReaderContactlessTransactionLimit((java.lang.Long) obj);
                                }
                            }, optJSONObject2, "CONTACTLESS_TRX_LMT");
                            a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda7
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setReaderCvmRequiredLimit((java.lang.Long) obj);
                                }
                            }, optJSONObject2, "CVM_REQUIRED_LMT");
                            a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda8
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setReaderCvmRequiredLimitCashback((java.lang.Long) obj);
                                }
                            }, optJSONObject2, "CVM_REQUIRED_LMT_CASHBACK");
                            a(new java.util.function.Consumer() { // from class: zb.b$$ExternalSyntheticLambda9
                                @Override // java.util.function.Consumer
                                public final void accept(java.lang.Object obj) {
                                    common.emv.configuration.EntryConfigurationData.Builder.this.setTerminalFloorLimit((java.lang.Long) obj);
                                }
                            }, optJSONObject2, "TERMINAL_FLOOR_LMT");
                            str2 = str12;
                            if (optJSONObject2.has(str2)) {
                                entryConfigurationDataBuilder3.setTerminalTransactionQualifier(common.emv.util.HexUtil.decode(optJSONObject2.optString(str2)));
                            }
                            str = str11;
                            if (optJSONObject2.has(str)) {
                                str3 = str7;
                                entryConfigurationDataBuilder3.setListOfSupportedAidsForNonPPSE(optJSONObject2.optString(str));
                                i4++;
                                str12 = str2;
                                str7 = str3;
                                jSONArray3 = jSONArray4;
                                optJSONArray = jSONArray2;
                                str11 = str;
                                length = i5;
                            }
                        } else {
                            jSONArray2 = optJSONArray;
                            str = str11;
                            str2 = str12;
                        }
                        str3 = str7;
                        i4++;
                        str12 = str2;
                        str7 = str3;
                        jSONArray3 = jSONArray4;
                        optJSONArray = jSONArray2;
                        str11 = str;
                        length = i5;
                    }
                }
            }
            i = i2 + 1;
            map2 = map;
        }
    }

    public static void c(java.util.Map<java.lang.String, java.util.List<common.emv.configuration.DataObjectList>> map, org.json.JSONArray jSONArray) {
        if (a(jSONArray)) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
            java.lang.String optString = optJSONObject.optString("RID");
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("CRL");
            java.util.List<common.emv.configuration.DataObjectList> list = map.get(optString);
            if (list == null) {
                list = new java.util.ArrayList<>();
                map.put(optString, list);
            }
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                common.emv.configuration.DataObjectList dataObjectList = new common.emv.configuration.DataObjectList();
                d(dataObjectList, optJSONArray.optJSONArray(i2));
                list.add(dataObjectList);
            }
        }
    }

    public static void b(java.util.Map<java.lang.String, java.util.List<common.emv.configuration.DataObjectList>> map, org.json.JSONArray jSONArray) {
        if (a(jSONArray)) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
            java.lang.String optString = optJSONObject.optString("RID");
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("KEYS");
            java.util.List<common.emv.configuration.DataObjectList> list = map.get(optString);
            if (list == null) {
                list = new java.util.ArrayList<>();
                map.put(optString, list);
            }
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                common.emv.configuration.DataObjectList dataObjectList = new common.emv.configuration.DataObjectList();
                d(dataObjectList, optJSONArray.optJSONArray(i2));
                list.add(dataObjectList);
            }
        }
    }

    public static boolean a(org.json.JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static void a(java.util.function.Consumer<java.lang.Long> consumer, org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject.has(str)) {
            consumer.accept(jSONObject.isNull(str) ? null : java.lang.Long.valueOf(jSONObject.optLong(str)));
        }
    }
}
